package com.yuhong.oa.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yuhong.oa.entity.MenuDO;

public class MenuQueryVO {
	/**
	 * 菜单编号
	 */
	@JsonProperty("id")
	private String menuId;
	/**
	 * 菜单名称
	 */
	@JsonProperty("text")
    private String name;
    /**
     * 资源路径
     */
	@JsonProperty("attributes")//如果自定义属性，只有一个的情况下，可以直接添加该注解，如果时多个的情况，应该将属性封装成Attributes对象
    private String url;
    /**
     * 父菜单
     */
    private String parentId;    
    /**
     * 状态名称
     */
    private String stateName;
    
    /**
     * 备注
     */
    private String remark;
    
    private List<MenuQueryVO> children;

	@Override
	public String toString() {
		return "MenuQueryVO [menuId=" + menuId + ", name=" + name + ", url=" + url + ", parentId=" + parentId
				+ ", stateName=" + stateName + ", remark=" + remark + ", children=" + children + "]";
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<MenuQueryVO> getChildren() {
		return children;
	}

	public void setChildren(List<MenuQueryVO> children) {
		this.children = children;
	}

	
}
