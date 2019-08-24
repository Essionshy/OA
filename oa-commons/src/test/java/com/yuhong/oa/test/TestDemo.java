package com.yuhong.oa.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.yuhong.oa.exception.ResultException;
import com.yuhong.oa.util.DateUtils;

public class TestDemo {

	public static void main(String[] args) throws ParseException, ResultException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		
		//System.out.println(sdf.parse("08/24/2019"));
		System.out.println(DateUtils.getParseDate("08/24/2019", DateUtils.BACKSLASHED_DATE_TYPE_MM_DD_YYYY));
	}

}
