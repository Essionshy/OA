package com.yuhong.oa.dto;

import com.yuhong.oa.util.PageQuery;
import com.yuhong.oa.vo.MenuQueryVO;
/**
 * 菜单数据传递类
 * @author William
 *
 */
public class MenuDTO {
	
	private MenuQueryVO menu;
	
	private PageQuery pageQuery;

	@Override
	public String toString() {
		return "MenuDTO [menu=" + menu + ", pageQuery=" + pageQuery + "]";
	}

	public MenuQueryVO getMenu() {
		return menu;
	}

	public void setMenu(MenuQueryVO menu) {
		this.menu = menu;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
}
