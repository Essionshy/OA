package com.yuhong.oa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuhong.oa.dto.PositionDTO;
import com.yuhong.oa.service.IPositionService;
import com.yuhong.oa.util.DataGridResult;
import com.yuhong.oa.util.PageQuery;
import com.yuhong.oa.vo.PositionQueryVO;

@Controller
public class PositionController {
	private static final Logger logger = LoggerFactory.getLogger(PositionController.class);
	@Autowired
	private IPositionService PositionService;

	@GetMapping("/position")
	public String getPosition() {
		return "position/PositionQuery";
	}

	@ResponseBody
	@RequestMapping(value = "/position/list")
	public DataGridResult listPositions(PositionDTO dto, int page, int rows) throws Exception {
		logger.debug(""+(null == dto)+dto.toString());
		// 对参数进行非空判断
		dto = (dto!=null) ? dto : new PositionDTO();
		long total = PositionService.getPositionTotalCount(dto);
		logger.debug("总记录数"+total);
		//logger.debug(dto.getPosition().toString());
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(page, rows, total);
		dto.setPageQuery(pageQuery);
		List<PositionQueryVO> list = PositionService.listPositions(dto);
		DataGridResult dgr = new DataGridResult();
		dgr.setRows(list);
		dgr.setTotal(total);
		return dgr;
	}
}
