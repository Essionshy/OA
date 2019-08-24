package com.yuhong.oa.service;

import java.util.List;

import com.yuhong.oa.dto.DeptDTO;
import com.yuhong.oa.vo.DeptQueryVO;

/**
 * 部门服务层接口
 * @author William
 *
 */
public interface IDeptService {
	/**
	 * 条件查询部门列表
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	List<DeptQueryVO> listDepts(DeptDTO dto)throws Exception;
	/**
	 * 	条件查询部门记录总数
	 * @return
	 * @throws Exception
	 */
	long getDeptTotalCount(DeptDTO dto)throws Exception;
}
