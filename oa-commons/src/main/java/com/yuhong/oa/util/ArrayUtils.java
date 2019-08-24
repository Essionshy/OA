package com.yuhong.oa.util;

public class ArrayUtils {
	public static  void printArray(Object [] objs) {
		System.out.println("**************数组长度："+objs.length+"****************");
		for(int i=0;i<objs.length;i++) {
			System.out.println("索引："+i+"值："+objs[i]);
		}
	}
}
