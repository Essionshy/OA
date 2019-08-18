package com.yuhong.oa.util;

import com.yuhong.oa.exception.ResultException;

/**
 * 响应结果工具类，使ResultMessage可以链式注入值
 * 
 * @author William
 *
 */
public class ResultUtils {

	/**
	 * #处理增删改返回信息的工具类
	 * 
	 * @param count
	 * @return
	 */
	public static ResultMessage success(String resource, int messageCode, Object[] objs) {
		String message = getMessage(resource,messageCode,objs);
		return new ResultMessage(ResultMessage.RESULT_TYPE_SUCCESS, messageCode, message);
	}

	public static ResultMessage fail(String resource, int messageCode, Object[] objs) {

		String message = getMessage(resource,messageCode,objs);
		
		return new ResultMessage(ResultMessage.RESULT_TYPE_FAIL, messageCode, message);
	}
	/**
	 * 获取提示消息
	 * @param resource
	 * @param messageCode
	 * @param objs
	 * @return
	 */
	private static String getMessage(String resource, int messageCode, Object[] objs) {

		String message = null;
		if (null == objs) {
			//返回不带参数类型的提示消息
			message = ResourceUtils.getValue(resource, String.valueOf(messageCode));
		} else {
			//返回带参数类型的提示消息
			message = ResourceUtils.getValue(resource, String.valueOf(messageCode), objs);
		}
		return message;
	}
	/**
	 * 获取警告消息
	 * @param resource
	 * @param messageCode
	 * @param objs
	 * @return
	 */
	public static ResultMessage warn(String resource, int messageCode, Object[] objs) {

		String message = getMessage(resource,messageCode,objs);
		
		return new ResultMessage(ResultMessage.RESULT_TYPE_WARN, messageCode, message);
	}

	/**
	 * 获取一般提示信息
	 * @param resource
	 * @param messageCode
	 * @param objs
	 * @return
	 */
	public static ResultMessage info(String resource, int messageCode, Object[] objs) {

		String message = getMessage(resource,messageCode,objs);
		
		return new ResultMessage(ResultMessage.RESULT_TYPE_WARN, messageCode, message);
	}
	/**
	 * 抛出自定义异常方法
	 * @param resultMessagae
	 * @throws ResultException
	 */
	public static void throwException(ResultMessage resultMessagae)throws  ResultException{
		throw new ResultException(resultMessagae);
	}

}
