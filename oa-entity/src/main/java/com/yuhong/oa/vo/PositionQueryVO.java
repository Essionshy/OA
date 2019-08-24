package com.yuhong.oa.vo;
/**
 * 职务数据传输类
 * @author William
 *
 */
public class PositionQueryVO {
	private String code;// 职务代码

	private String name;// 职务名称

	private String positionClassCode;// 职别代码

	private String positionClassName;// 职别名称

	private Byte state;// 状态码

	private String stateName;// 状态名称

	private String remark;// 备注
	
	
	@Override
	public String toString() {
		return "PositionDTO [code=" + code + ", name=" + name + ", positionClassCode=" + positionClassCode
				+ ", positionClassName=" + positionClassName + ", state=" + state + ", stateName=" + stateName
				+ ", remark=" + remark + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPositionClassCode() {
		return positionClassCode;
	}

	public void setPositionClassCode(String positionClassCode) {
		this.positionClassCode = positionClassCode;
	}

	public String getPositionClassName() {
		return positionClassName;
	}

	public void setPositionClassName(String positionClassName) {
		this.positionClassName = positionClassName;
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
