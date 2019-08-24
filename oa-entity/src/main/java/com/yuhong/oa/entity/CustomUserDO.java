package com.yuhong.oa.entity;

import java.util.Date;

/**
 * 自定义UserDO扩展类
 * @author William
 *
 */
public class CustomUserDO extends UserDO{
	private String realName;// 真实姓名
	private String deptId;//部门代码
	private String deptName;// 部门名称
	private String positionId;//职位代码
	private String positionName;// 职务名称	
	private String stateName;// 状态名称
	private Date startDate;//
	private Date endDate;
	
	//定义分页信息
	private Integer startPage;
	
	private Integer pageSize;//
	
	
	public CustomUserDO() {
		super();
	}
	@Override
	public String toString() {
		return "CustomUserDO [realName=" + realName + ", deptId=" + deptId + ", deptName=" + deptName + ", positionId="
				+ positionId + ", positionName=" + positionName + ", stateName=" + stateName + ", startDate="
				+ startDate + ", endDate=" + endDate + ", startPage=" + startPage + ", pageSize=" + pageSize + "]";
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getStartPage() {
		return startPage;
	}
	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}	
}
