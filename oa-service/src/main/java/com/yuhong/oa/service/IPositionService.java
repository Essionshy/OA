package com.yuhong.oa.service;

import java.util.List;

import com.yuhong.oa.dto.PositionDTO;
import com.yuhong.oa.vo.PositionQueryVO;

/**
 * 职务服务层接口
 * @author William
 *
 */
public interface IPositionService {
	/**
	 * 条件查询职务列表
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	List<PositionQueryVO> listPositions(PositionDTO dto)throws Exception;
	/**
	 * 	条件查询职务记录总数
	 * @return
	 * @throws Exception
	 */
	long getPositionTotalCount(PositionDTO dto)throws Exception;
}
