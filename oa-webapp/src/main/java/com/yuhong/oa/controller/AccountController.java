package com.yuhong.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
	@RequestMapping("/index")
	public String index() {
		int i=1/0;
		return "Index";
	}
}
