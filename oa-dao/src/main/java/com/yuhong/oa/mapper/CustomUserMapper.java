package com.yuhong.oa.mapper;

import java.util.List;

import com.yuhong.oa.dto.UserDTO;
import com.yuhong.oa.entity.CustomUserDO;
import com.yuhong.oa.vo.UserQueryVO;

/**
 * 
 * @author William
 *
 */
public interface CustomUserMapper {
	/**
	 * 条件查询用户列表
	 * @param dto
	 * @return
	 */
	List<CustomUserDO> listUserByCondition(CustomUserDO userDO)throws Exception; 
	/**
	 * 	条件查询用户记录总数
	 * @return
	 * @throws Exception
	 */
	long getUserTotalCount(CustomUserDO userDO)throws Exception;
}
