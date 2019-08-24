package com.yuhong.oa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuhong.oa.service.IMenuService;
import com.yuhong.oa.vo.MenuQueryVO;

@Controller
public class MenuController {
	private static final Logger logger=LoggerFactory.getLogger(MenuController.class);
	@Autowired
	private IMenuService menuService;
	@RequestMapping(value="/menu",method=RequestMethod.GET)
	public String queryMenu(Model model) throws Exception{
		logger.debug("请求菜单管理页面");
		return "menu/menuQuery";
	}
	@ResponseBody
	@RequestMapping(value="/menu/list")
	public List<MenuQueryVO> listAllMenu() throws Exception{
		logger.debug("查询所有菜单列表");
		return menuService.listAll();
	}
	
}
