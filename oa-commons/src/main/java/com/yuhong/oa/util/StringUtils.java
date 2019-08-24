package com.yuhong.oa.util;

/**
 * 
 * @author William
 *
 */
public class StringUtils {

	/**
	 * 判断字符串是否符合给定格式；pattern由用户指定而非固定表达式； 因此使用正则表达式不适合该场景。
	 * 假设：从以下几个维度进行比较字符串格式，字符串长度，如果字符长度相同，则将字符串拆分成字符数组
	 * 
	 * @param source
	 * @param pattern
	 * @return
	 */
	public static boolean isMatchedDate(String source, String pattern) {
		// 用户输入日期校验：格式校验与合法性校验，合法性是指，例如1月有31天，则用户日期天数不能超过31；

		// 思路：可以将paterrn转为字符数组，再组成一个正则表达式，再调用String.matches（regex)方法进行比较；

		// 日期时间分为日期部分和时间部分，可以将表达式进行拆分

		// 去掉前后端空格，再通过空格分隔字符串
		String[] datetime = pattern.trim().split(" ");
		// 解析日期时间字符串
		ArrayUtils.printArray(datetime);
		String date = datetime[0].toString();// 取出日期值
		String time = "";// 取出时间值
		// 该循环为了预防日期与时间之间有多余的空格
		for (int i = 1; i < datetime.length; i++) {
			if (!("".equals(datetime[i]))) {
				time = datetime[i];
			}
		}
		System.out.println("时间：" + time.equals("") + time);
		// 定义一个正则表达式
		String regex = "";
		//
		if ("".equals(time)) {
			System.out.println("时间：" + time.equals(""));

			// 表示只是日期
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
			// 表示只是日期
			// 假设允许用户输入的日期时间格式为：yyyy-MM-dd 或者 MM-dd-yyyy;或者yyyy/MM/dd或者MM/dd/yyyy
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
			// 日期时间型
		}
		System.out.println("正则表达式：" + regex);
		return source.matches(regex);
	}

	public static boolean validateDate(String source, String pattern) {

		return false;

	}

	/**
	 * 校验时间
	 * 
	 * @param source
	 * @return
	 */
	public static boolean validateTimeFormat(String source) {
		String regex = "\\d{2}:\\d{2}:\\d{2}";// 定义时分秒格式
		return source.matches(regex);

	}

	public static void main(String[] args) {
		String pattern = "MM/dd/yyyy HH:mm:ss";
		// 通常情况下，如果是用户输入日期时间，无法判断日期与时间之间有多少个空格，因此需要对转换的字符串数组进行遍历取值；
		String source = "08/24/2019 12:12:12";
		System.out.println("日期格式是否满足格式要求：" + isMatchedDate(source, pattern));
		String time = "25:23:23";
		System.out.println("时间格式是否满足格式要求：" + validateTimeFormat(time));

		/*
		 * String regex="\\d{4}/\\d{2}/\\d{2}";
		 * 
		 * String source="1995/11/12";
		 * System.out.println("请问是否满足条件"+source.matches(regex));
		 */
		/*
		 * System.out.println("*************日期："+date+"*******时间："+time+"时间是否为空串"+(null=
		 * =time));
		 * 
		 */

	}

}
