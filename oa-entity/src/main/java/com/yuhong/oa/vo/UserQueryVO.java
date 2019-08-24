package com.yuhong.oa.vo;

/**
 * 用户查询页面显示对象类
 * 
 * @author William
 *
 */
public class UserQueryVO {

	private String userName;// 用户名
	private String realName;// 真实姓名
	private String deptId;// 部门编号
	private String deptName;// 部门名称
	private String positionId;// 职务代码
	private String positionName;// 职务名称
	private Integer state;// 状态码
	private String stateName;// 状态名称
	private String gmtCreate;// 创建时间
	private String createDate;
	private String remark;// 备注

	// 定义额外查询条件，描述某一时间段范围
	private String startDate;// 创建用户起始时间
	private String endDate;// 创建用户结束时间
	@Override
	public String toString() {
		return "UserQueryVO [userName=" + userName + ", realName=" + realName + ", deptId=" + deptId + ", deptName="
				+ deptName + ", positionId=" + positionId + ", positionName=" + positionName + ", state=" + state
				+ ", stateName=" + stateName + ", gmtCreate=" + gmtCreate + ", createDate=" + createDate + ", remark="
				+ remark + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
