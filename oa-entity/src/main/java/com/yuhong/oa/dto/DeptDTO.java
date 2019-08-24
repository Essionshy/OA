package com.yuhong.oa.dto;

import com.yuhong.oa.util.PageQuery;
import com.yuhong.oa.vo.DeptQueryVO;

/**
 * 部门数据传输对象
 * 
 * @author William
 *
 */
public class DeptDTO {
	private DeptQueryVO dept;
	
	private PageQuery pageQuery;

	@Override
	public String toString() {
		return "DeptDTO [dept=" + dept + ", pageQuery=" + pageQuery + "]";
	}

	public DeptQueryVO getDept() {
		return dept;
	}

	public void setDept(DeptQueryVO dept) {
		this.dept = dept;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
	
}
