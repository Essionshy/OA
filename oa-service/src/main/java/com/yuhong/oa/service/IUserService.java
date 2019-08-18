package com.yuhong.oa.service;

import java.util.List;

import com.yuhong.oa.entity.UserDO;
import com.yuhong.oa.entity.dto.UserDTO;

/**
 * 系统用户服务层接口
 * @author William
 *
 */
public interface IUserService {
	/**
	 * 用户条件查询
	 * @param dto
	 * @return
	 */
	List<UserDO> listUsers(UserDTO dto);

}
