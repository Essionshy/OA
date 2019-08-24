package com.yuhong.oa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuhong.oa.dto.UserDTO;
import com.yuhong.oa.service.IDeptService;
import com.yuhong.oa.service.IPositionService;
import com.yuhong.oa.service.IUserService;
import com.yuhong.oa.util.DataGridResult;
import com.yuhong.oa.util.PageQuery;
import com.yuhong.oa.vo.DeptQueryVO;
import com.yuhong.oa.vo.PositionQueryVO;
import com.yuhong.oa.vo.UserQueryVO;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private IUserService userService;
	@Autowired
	private IDeptService deptService;
	@Autowired
	private IPositionService positionService;
	
	/**
	 * 请求加载用户管理界面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/user")
	public String getUser(Model model)throws Exception {
		logger.debug("加载用户管理界面！！");
		//此处通过Model传值，将用户管理界面的字典数据传递到页面
		//查询部门列表
		
		
		List<DeptQueryVO> depts=deptService.listDepts(null);
		logger.debug("查询到的部门列表"+depts);
		//查询职位列表
		List<PositionQueryVO> positions=positionService.listPositions(null);
		//定义一个map集合用户存放以上信息
		Map<String,Object> dictionary=new HashMap<>();
		dictionary.put("depts", depts);
		dictionary.put("positions", positions);
		model.addAttribute("DicInfo", dictionary);		
		return "user/UserQuery";
	}

	@ResponseBody
	@RequestMapping(value = "/user/list")
	public DataGridResult listUsers(UserDTO dto, Integer page, Integer rows) throws Exception {
		logger.debug("" + (null == dto) + dto.toString());
		// 对参数进行非空判断		
		long total = userService.getUserTotalCount(dto);
		logger.debug("总记录数" + total);
		// logger.debug(dto.getUser().toString());
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(page, rows, total);
		dto.setPageQuery(pageQuery);
		List<UserQueryVO> list = userService.listUserByCondition(dto);
		logger.debug("总记录数" + list);
		DataGridResult dgr = new DataGridResult();
		dgr.setRows(list);
		dgr.setTotal(total);
		return dgr;
	}
}
