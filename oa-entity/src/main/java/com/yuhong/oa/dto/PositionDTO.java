package com.yuhong.oa.dto;

import com.yuhong.oa.util.PageQuery;
import com.yuhong.oa.vo.PositionQueryVO;

/**
 * 职务数据传输类
 * 
 * @author William
 *
 */
public class PositionDTO {
	private PositionQueryVO position;
	
	private PageQuery pageQuery;
	
	@Override
	public String toString() {
		return "PositionDTO [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public PositionQueryVO getPosition() {
		return position;
	}

	public void setPosition(PositionQueryVO position) {
		this.position = position;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
}
