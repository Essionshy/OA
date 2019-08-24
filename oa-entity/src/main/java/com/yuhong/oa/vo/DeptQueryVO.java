package com.yuhong.oa.vo;

import java.util.Date;

/**
 * 部门数据传输对象
 * 
 * @author William
 *
 */
public class DeptQueryVO {

	private String deptId;// 部门编号

	private String name;// 部门名称

	private String parentId;// 上级部门编号 （用于修改，查询）

	private String parentName;// 上级部门名称 （用于显示）

	private String levelCode;// 部门等级

	private Date createDate;// 成立日期

	private String managerId;// 部门经理

	private String telephone;// 联系电话

	private String email;// 电子邮箱

	private String address;// 联系地址

	private Byte state;// 部门状态码

	private String stateName;// 状态名称

	private String remark;
	
	@Override
	public String toString() {
		return "DeptDTO [deptId=" + deptId + ", name=" + name + ", parentId=" + parentId + ", parentName=" + parentName
				+ ", levelCode=" + levelCode + ", createDate=" + createDate + ", managerId=" + managerId
				+ ", telephone=" + telephone + ", email=" + email + ", address=" + address + ", state=" + state
				+ ", stateName=" + stateName + ", remark=" + remark + "]";
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
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
	
}
