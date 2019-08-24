package com.yuhong.oa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhong.oa.dto.DeptDTO;
import com.yuhong.oa.entity.DepartmentDO;
import com.yuhong.oa.entity.DepartmentDOExample;
import com.yuhong.oa.entity.DepartmentDOExample.Criteria;
import com.yuhong.oa.mapper.DepartmentDOMapper;
import com.yuhong.oa.mapper.EmployeeDOMapper;
import com.yuhong.oa.service.IDeptService;
import com.yuhong.oa.vo.DeptQueryVO;

/**
 * 部门服务层实现类
 * 
 * @author William
 *
 */
@Service
public class DeptServiceImpl implements IDeptService {
	@Autowired
	private DepartmentDOMapper deptMapper;
	
	private EmployeeDOMapper empMapper;

	@Override
	public List<DeptQueryVO> listDepts(DeptDTO dto) throws Exception {

		DepartmentDOExample example = new DepartmentDOExample();

		// 定义查询条件参数
		Criteria criteria = example.createCriteria();
		if (null != dto && null !=dto.getDept()) {
			criteria.andNameLike("%"+dto.getDept().getName()+"%");
		}

		List<DepartmentDO> deptDOs = deptMapper.selectByExample(example);
		List<DeptQueryVO> deptVOs = null;
		if (deptDOs != null) {
			deptVOs = new ArrayList<>();
			for (DepartmentDO deptDO : deptDOs) {
				DeptQueryVO deptVO = new DeptQueryVO();
				BeanUtils.copyProperties(deptDO, deptVO);
				deptVOs.add(deptVO);
			}
		}
		return deptVOs;
	}
	/**
	 * 根据条件查询满足条件记录数
	 */
	@Override
	public long getDeptTotalCount(DeptDTO dto) throws Exception {

		DepartmentDOExample example = new DepartmentDOExample();
		// 定义查询条件参数
		Criteria criteria = example.createCriteria();
		if (null!=dto && null !=dto.getDept()) {
			criteria.andNameLike("%"+dto.getDept().getName()+"%");
		}
		return deptMapper.countByExample(example);
	}
}
