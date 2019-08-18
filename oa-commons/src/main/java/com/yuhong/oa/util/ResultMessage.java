package com.yuhong.oa.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 页面提交返回响应消息封装类
 * 
 * @author William
 *
 */
@SuppressWarnings("unused")
public class ResultMessage {

	public static final int RESULT_TYPE_FAIL = 0;// 失败
	public static final int RESULT_TYPE_SUCCESS = 1;// 成功
	public static final int RESULT_TYPE_WARN = 2;// 警告
	public static final int RESULT_TYPE_INFO = 3;// 提示

	public ResultMessage() {
		super();
	}

	public ResultMessage(int type, String message) {
		super();
		this.type = type;
		this.message = message;
	}

	public ResultMessage(int type, int messageCode, String message) {
		super();
		this.type = type;
		this.messageCode = messageCode;
		this.message = message;
	}

	/**
	 * 消息提示类型：成功，失败，警告，提示
	 */
	private int type;// 返回状态码
	/**
	 * 返回消息代码
	 */
	private int messageCode;

	/**
	 * 返回提示信息
	 */
	private String message;

	/**
	 * 返回查询结果
	 */

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
