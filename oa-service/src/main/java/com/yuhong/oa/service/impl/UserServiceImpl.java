package com.yuhong.oa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhong.oa.config.Configure;
import com.yuhong.oa.dto.UserDTO;
import com.yuhong.oa.dto.UserLoginDTO;
import com.yuhong.oa.entity.CustomUserDO;
import com.yuhong.oa.entity.UserDO;
import com.yuhong.oa.entity.UserDOExample;
import com.yuhong.oa.entity.UserDOExample.Criteria;
import com.yuhong.oa.exception.ResultException;
import com.yuhong.oa.mapper.CustomUserMapper;
import com.yuhong.oa.mapper.UserDOMapper;
import com.yuhong.oa.service.IUserService;
import com.yuhong.oa.util.DateUtils;
import com.yuhong.oa.util.PageQuery;
import com.yuhong.oa.util.ResultUtils;
import com.yuhong.oa.vo.UserQueryVO;

/**
 * 用户管理服务层实现类
 * 
 * @author William
 *
 */
@Service
public class UserServiceImpl implements IUserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private CustomUserMapper userMapper;
	@Autowired
	private UserDOMapper userDOMapper;

	@Override
	public List<UserQueryVO> listUserByCondition(UserDTO dto) throws Exception {

		CustomUserDO condition = createCondition(dto);
		List<CustomUserDO> listUserDO = userMapper.listUserByCondition(condition);
		logger.debug("数据库查询结果集"+listUserDO);
		List<UserQueryVO> listUserVO = null;
		if (null != listUserDO) {
			listUserVO = new ArrayList<>();
			for (CustomUserDO userDO : listUserDO) {
				UserQueryVO userVO = new UserQueryVO();
				BeanUtils.copyProperties(userDO, userVO);
				userVO.setCreateDate(DateUtils.getFormatDate(userDO.getGmtCreate(),DateUtils.DASHED_DATE_TYPE_YYYY_MM_DD));
				listUserVO.add(userVO);
			}
		}
		logger.debug("有返回用户表示 层对象"+listUserVO);
		return listUserVO;
	}

	@Override
	public long getUserTotalCount(UserDTO dto) throws Exception {
		CustomUserDO condition = createCondition(dto);
		return userMapper.getUserTotalCount(condition);
	}

	private CustomUserDO createCondition(UserDTO dto) throws ResultException {
		CustomUserDO condition = null;
		if (null != dto) {
			UserQueryVO userVO = dto.getUser();
			PageQuery pageQuery = dto.getPageQuery();
			// 对参数合法性校验，险了前端校验外，后端也需要校验 提高系统安全性
			condition = new CustomUserDO();
			if(null != userVO) {
				logger.debug("用户状态：****************** 用户输入参数"+userVO.getState()+"*********************");
				BeanUtils.copyProperties(userVO, condition);
				logger.debug("用户状态：******************注入条件参数"+condition.getState()+"*********************");
				logger.debug("查询起始日期："+userVO.getStartDate()+"查询结束日期"+userVO.getEndDate());
				condition.setStartDate(DateUtils.getParseDate(userVO.getStartDate(),DateUtils.BACKSLASHED_DATE_TYPE_MM_DD_YYYY));
				condition.setEndDate(DateUtils.getParseDate(userVO.getEndDate(),DateUtils.BACKSLASHED_DATE_TYPE_MM_DD_YYYY));
			}
			if(null !=pageQuery) {
				condition.setStartPage(pageQuery.getStartPage());
				condition.setPageSize(pageQuery.getPageSize());
			}			
		}
		return condition;
	}

	@Override
	public boolean login(UserLoginDTO dto) throws Exception {

		boolean flag = false;
		UserDOExample example = new UserDOExample();
		Criteria criteria = example.createCriteria();

		criteria.andUserNameEqualTo(dto.getUserName());
		criteria.andPasswordEqualTo(dto.getPassword());
		List<UserDO> users = userDOMapper.selectByExample(example);

		if (users != null && users.size() != 0) {
			logger.debug("用户存在" + users.size());
			flag = true;
		} else {
			// 抛出自定义异常：异常代码messageCode 100 用户名或密码不正确！
			logger.debug("用户名或密码不正确" + ResultUtils.fail(Configure.SYS_MESSAGE, 101, null));
			ResultUtils.throwException(ResultUtils.fail(Configure.SYS_MESSAGE, 101, null));
		}
		return flag;
	}
}
