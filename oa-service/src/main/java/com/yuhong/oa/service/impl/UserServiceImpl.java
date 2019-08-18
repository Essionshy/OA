package com.yuhong.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhong.oa.entity.UserDO;
import com.yuhong.oa.entity.UserDOExample;
import com.yuhong.oa.entity.UserDOExample.Criteria;
import com.yuhong.oa.entity.dto.UserDTO;
import com.yuhong.oa.mapper.UserDOMapper;
import com.yuhong.oa.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserDOMapper userMapper;

	@Override
	public List<UserDO> listUsers(UserDTO dto) {
		UserDOExample example = new UserDOExample();
		Criteria criteria = example.createCriteria();
		
		List<UserDO> list= userMapper.selectByExample(example);

		return list;
	}

}
