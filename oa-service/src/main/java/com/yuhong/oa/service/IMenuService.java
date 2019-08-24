package com.yuhong.oa.service;

import java.util.List;

import com.yuhong.oa.dto.MenuDTO;
import com.yuhong.oa.vo.MenuQueryVO;

/**
 * 菜单管理服务层接口
 * @author William
 *
 */
public interface IMenuService {
	/**
	 * 查询一级菜单列表
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	List<MenuQueryVO> listAll()throws Exception;
	/**
	 * 查询二级菜单列表
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	List<MenuQueryVO> listChildrenByPid(String pid)throws Exception;
}
