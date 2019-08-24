package com.yuhong.oa.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.yuhong.oa.config.Configure;
import com.yuhong.oa.exception.ResultException;

public class DateUtils {

	public static final String DASHED_DATE_TIME_TYPE_YYYY_MM_DD = "yyyy-MM-dd HH:mm:ss";

	public static final String DASHED_DATE_TIME_TYPE_MM_DD_YYYY = "MM-dd-yyyy HH:mm:ss";

	public static final String DASHED_DATE_TYPE_YYYY_MM_DD = "yyyy-MM-dd";

	public static final String DASHED_DATE_TYPE_MM_DD_YYYY = "MM-dd-yyyy";

	public static final String BACKSLASHED_DATE_TIME_TYPE_YYYY_MM_DD = "yyyy/MM/dd HH:mm:ss";

	public static final String BACKSLASHED_DATE_TIME_TYPE_MM_DD_YYYY = "MM/dd/yyyy HH:mm:ss";

	public static final String BACKSLASHED_DATE_TYPE_YYYY_MM_DD = "yyyy/MM/dd";

	public static final String BACKSLASHED_DATE_TYPE_MM_DD_YYYY = "MM/dd/yyyy";

	private static final String DEFAULT_DATE_TIME = "";

	public static SimpleDateFormat createSimpleDateFormat(String pattern) {
		return new SimpleDateFormat(pattern);
	}

	/**
	 * 判断输入日期是否满足
	 * 
	 * @param source
	 * @param pattern
	 * @return
	 */
	public static boolean isDateFormat(String source, String pattern) {
		if (null == source && ("").equals(source)) {
			return false;
		} else {
			String regex = resolvePattern(pattern);		
			return source.matches(regex);
		}
	}
	
	public static boolean isDateTime(String pattern) {

		if (null != pattern && !("".equals(pattern))) {
			String[] datetime = pattern.trim().split(" ");
			return datetime.length == 1 ? false : true;
		}
		return false;
	}

	/**
	 * 解析日期表达式 根据指定日期格式返回对应的正则表达式
	 * 
	 * @param pattern
	 * @return
	 */
	public static String resolvePattern(String pattern) {
		// 注意此处一定要键入空格，否则会将字符串依次拆分
		String regex = null;
		if (null != pattern && !("".equals(pattern))) {
			String[] datetime = pattern.trim().split(" ");
			String date = datetime[0];
			String time = "";
			// 该循环为了预防日期与时间之间有多余的空格
			for (int i = 1; i < datetime.length; i++) {
				if (!("".equals(datetime[i]))) {
					time = datetime[i];
				}
			}
			if ("".equals(time)) {
				// 假设允许用户输入的日期时间格式为：yyyy-MM-dd 或者 MM-dd-yyyy;或者yyyy/MM/dd或者MM/dd/yyyy
				if (date.indexOf('-') == 4 && date.lastIndexOf('-') == 7) {
					// 表示日期格式为yyyy-MM-dd
					regex = "\\d{4}-\\d{2}-\\d{2}";
				} else if (date.indexOf('-') == 2 && date.lastIndexOf('-') == 5) {
					// 表示日期格式为MM-dd-yyyy
					regex = "\\d{2}-\\d{2}-\\d{4}";
				} else if (date.indexOf('/') == 4 && date.lastIndexOf('/') == 7) {
					// 表示日期格式为yyyy/MM/dd
					regex = "\\d{4}/\\d{2}/\\d{2}";
				} else if (date.indexOf('/') == 2 && date.lastIndexOf('/') == 5) {
					// 表示日期格式为MM/dd/yyyy
					regex = "\\d{2}/\\d{2}/\\d{4}";
				}
			} else {
				if (date.indexOf('-') == 4 && date.lastIndexOf('-') == 7) {
					// 表示日期格式为yyyy-MM-dd
					regex = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";

				} else if (date.indexOf('-') == 2 && date.lastIndexOf('-') == 5) {
					// 表示日期格式为MM-dd-yyyy
					regex = "\\d{2}-\\d{2}-\\d{4} \\d{2}:\\d{2}:\\d{2}";

				} else if (date.indexOf('/') == 4 && date.lastIndexOf('/') == 7) {
					// 表示日期格式为yyyy/MM/dd
					regex = "\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}";
				} else if (date.indexOf('/') == 2 && date.lastIndexOf('/') == 5) {
					// 表示日期格式为MM/dd/yyyy
					regex = "\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2}";
				}
			}
		}
		return regex;
	}

	/**
	 * 获取格式化日期
	 * 
	 * @param date
	 * @return
	 */

	public static String getFormatDate(Date date, String pattern) {
		return (null != date) ? createSimpleDateFormat(pattern).format(date) : DEFAULT_DATE_TIME;
	}

	/**
	 * 将格式化字符串型日期时间转换成日期类型
	 * 
	 * @param source
	 * @param pattern
	 * @return
	 * @throws ResultException
	 */
	public static Date getParseDate(String source, String pattern) throws ResultException {
		Date date = null;
		try {
			if (isDateFormat(source, pattern)) {
				date = createSimpleDateFormat(pattern).parse(source);
			}

		} catch (ParseException e) {
			// 打印异常堆栈信息
			e.printStackTrace();
			// 抛出自定义异常
			ResultUtils.throwException(ResultUtils.fail(Configure.SYS_MESSAGE, 901, null));
		}
		return date;
	}
}
