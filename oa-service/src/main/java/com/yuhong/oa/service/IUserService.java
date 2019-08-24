package com.yuhong.oa.service;

import java.util.List;

import com.yuhong.oa.dto.UserDTO;
import com.yuhong.oa.dto.UserLoginDTO;
import com.yuhong.oa.vo.UserQueryVO;
/**
 *  用户管理服务层
 * @author William
 *
 */
public interface IUserService {
	/**
	 * 条件查询用户列表
	 * @param dto
	 * @return
	 */
	List<UserQueryVO> listUserByCondition(UserDTO dto)throws Exception;
	/**
	 * 	条件查询用户记录总数
	 * @return
	 * @throws Exception
	 */
	long getUserTotalCount(UserDTO dto)throws Exception;
	/**
	 * 用户登录业务
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	boolean login(UserLoginDTO dto) throws Exception;

}
