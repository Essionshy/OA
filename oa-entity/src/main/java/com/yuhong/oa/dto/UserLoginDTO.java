package com.yuhong.oa.dto;

public class UserLoginDTO {
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 记住我
	 */
	private String remember;
	
	public UserLoginDTO() {
		super();
	}
	public UserLoginDTO(String userName, String password, String remember) {
		super();
		this.userName = userName;
		this.password = password;
		this.remember = remember;
	}
	@Override
	public String toString() {
		return "UserLoginDTO [userName=" + userName + ", password=" + password + ", remember=" + remember + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRemember() {
		return remember;
	}
	public void setRemember(String remember) {
		this.remember = remember;
	}
	
}
