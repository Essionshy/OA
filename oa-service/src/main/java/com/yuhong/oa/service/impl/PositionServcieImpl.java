package com.yuhong.oa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhong.oa.dto.PositionDTO;
import com.yuhong.oa.entity.PositionDO;
import com.yuhong.oa.entity.PositionDOExample;
import com.yuhong.oa.entity.PositionDOExample.Criteria;
import com.yuhong.oa.mapper.PositionDOMapper;
import com.yuhong.oa.service.IPositionService;
import com.yuhong.oa.vo.PositionQueryVO;

@Service
public class PositionServcieImpl implements IPositionService {

	@Autowired
	private PositionDOMapper positionMapper;

	@Override
	public List<PositionQueryVO> listPositions(PositionDTO dto) throws Exception {
		PositionDOExample example = new PositionDOExample();

		// 定义查询条件参数
		Criteria criteria = example.createCriteria();
		if (null != dto && null != dto.getPosition()) {
			criteria.andNameLike(dto.getPosition().getName());
		}

		List<PositionDO> positionDOs = positionMapper.selectByExample(example);
		List<PositionQueryVO> positionVOs = null;
		if (positionDOs != null) {
			positionVOs = new ArrayList<>();
			for (PositionDO positionDO : positionDOs) {
				PositionQueryVO positionVO = new PositionQueryVO();
				BeanUtils.copyProperties(positionDO, positionVO);
				positionVOs.add(positionVO);
			}
		}
		return positionVOs;
	}

	@Override
	public long getPositionTotalCount(PositionDTO dto) throws Exception {
		PositionDOExample example = new PositionDOExample();

		// 定义查询条件参数
		Criteria criteria = example.createCriteria();
		if (null != dto && null != dto.getPosition()) {
			criteria.andNameLike(dto.getPosition().getName());
		}
		return positionMapper.countByExample(example);
	}

}
