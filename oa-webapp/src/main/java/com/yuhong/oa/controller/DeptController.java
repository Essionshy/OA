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

import com.yuhong.oa.dto.DeptDTO;
import com.yuhong.oa.dto.UserDTO;
import com.yuhong.oa.service.IDeptService;
import com.yuhong.oa.util.DataGridResult;
import com.yuhong.oa.util.PageQuery;
import com.yuhong.oa.vo.DeptQueryVO;
import com.yuhong.oa.vo.UserQueryVO;

@Controller
@RequestMapping("/dept")
public class DeptController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private IDeptService deptService;

	/**
	 * 处理部门查询列表页面请求
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String getDepts(Model model) throws Exception {
		logger.debug((model == null) + "参数是否为空");
		model.addAttribute("msg", "是否存在null");

		return "dept/DeptQuery";
	}

	/**
	 * 条件查询部门列表信息
	 * 
	 * @param dto  封装查询条件
	 * @param page 分页查询当前页码，可以为null
	 * @param rows 分页查询每页显示记录数，可以为null
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/list")
	public DataGridResult listDepts(DeptDTO dto, Integer page, Integer rows) throws Exception {

		logger.debug("查询部门列表：参数为dto=" + dto + "page=" + page + "rows=" + rows);
		long total = deptService.getDeptTotalCount(dto);
		//设置分页参数
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(page, rows, total);
		dto.setPageQuery(pageQuery);
		List<DeptQueryVO> list = deptService.listDepts(dto);
		DataGridResult dgr = new DataGridResult();
		dgr.setRows(list);
		dgr.setTotal(total);
		return dgr;
	}
}
