package com.yuhong.oa.util;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * 资源文件读取工具类
 * @author William
 *
 */
public class ResourceUtils implements Serializable{
		
	private static final long serialVersionUID = -4017921675175001726L;
	/**
	 * 系统语言环境，默认为中文zh
	 */
	public static final String LANGUAGE="zh";
	
	/**
	 * 
	 */
	public static final String COUNTRY="CN";
	/**
	 * 获取属性值
	 * @param resource
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	private static String getProperties(String baseName,String key) {
		Locale locale=getLocale();
		ResourceBundle rb=ResourceBundle.getBundle(baseName,locale);
		String value=null;
		try {
			value = new String(rb.getString(key).getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	private static Locale getLocale() {		
		return new Locale(LANGUAGE,COUNTRY);	
	}
	/**
	 * 获取资源文件中所有key
	 * @param baseName
	 * @return
	 */
	public static List<String> getKeys(String baseName){
		Locale locale=getLocale();
		ResourceBundle rb=ResourceBundle.getBundle(baseName,locale);
		List<String> keys=new ArrayList<>();
		Set<String> keySet=rb.keySet();
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()) {
			keys.add(it.next());
		}
		return keys;	
	}
	/**
	 * 返回不带参数的提示信息
	 * @param resource 配置资源文件名
	 * @param code 提示代码
	 * @return
	 * @throws Exception 
	 */
	public static String getValue(String resource, String key) {
	
		String value=getProperties(resource, key);	
		
		return value;
	}
	/**
	 * 获取带有参数的提示信息
	 * @param resource
	 * @param code
	 * @param objs
	 * @return
	 * @throws Exception 
	 */
	public static String getValue(String resource, String  key, Object[] objs){
		String pattern=getValue(resource,key);
		String value=MessageFormat.format(pattern, objs);		
		return value;
	}
}
