package com.yuhong.oa.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuhong.oa.config.Configure;
import com.yuhong.oa.dto.UserLoginDTO;
import com.yuhong.oa.service.IUserService;
import com.yuhong.oa.util.DateUtils;
import com.yuhong.oa.util.ResultMessage;
import com.yuhong.oa.util.ResultUtils;

@Controller
public class AccountController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private IUserService userService;

	/**
	 * 跳转用户登录页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() throws Exception {
		logger.debug("请求登录页面");
		return "account/Login";
	}

	/**
	 * 处理用户登录请求
	 * 
	 * @param dto
	 * @return
	 * @throws Exception 异常统一交给自定义全局异常处理器GlobalExceptionResolver处理
	 */
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResultMessage login(UserLoginDTO dto, HttpSession session) throws Exception {
		logger.debug("请求登录，参数为" + dto);
		if (userService.login(dto)) {

			session.setAttribute("USERINFO", dto.getUserName());
		}
		return ResultUtils.success(Configure.SYS_MESSAGE, 100, null);
	}

	/**
	 * 跳转首页
	 * 
	 * @return
	 */
	@RequestMapping("/main")
	public String index() {
		return "account/Main";
	}

	/**
	 * 跳转错误页面
	 * 
	 * @return
	 */
	@RequestMapping("/error")
	public String error() {
		return "base/Error";
	}

	/**
	 * 退出系统
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/logout")
	public String loggout(HttpSession session) {
		session.invalidate();
		return "Redirect:account/login";
	}
}
