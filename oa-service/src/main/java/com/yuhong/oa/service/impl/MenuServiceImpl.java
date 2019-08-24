package com.yuhong.oa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhong.oa.dto.MenuDTO;
import com.yuhong.oa.entity.MenuDO;
import com.yuhong.oa.entity.MenuDOExample;
import com.yuhong.oa.entity.MenuDOExample.Criteria;
import com.yuhong.oa.mapper.MenuDOMapper;
import com.yuhong.oa.service.IMenuService;
import com.yuhong.oa.vo.MenuQueryVO;

/**
 * 菜单服务层实现类
 * 
 * @author William
 *
 */
@Service
public class MenuServiceImpl implements IMenuService {
	private static final Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);
	@Autowired
	private MenuDOMapper menuMapper;

	
	@Override
	public List<MenuQueryVO> listAll() throws Exception {
		
		List<MenuQueryVO> menuVOs=null;
		MenuDOExample example= new MenuDOExample();
		List<MenuDO> menuDOs=menuMapper.selectByExample(example);
		if(menuDOs!=null) {
			menuVOs=new ArrayList<>();
			for(MenuDO menuDO:menuDOs) {
				MenuQueryVO menuVO=new MenuQueryVO();
				BeanUtils.copyProperties(menuDO, menuVO);
				if(menuDO.getParentId().equals("00")) {
					List<MenuQueryVO> children=listChildrenByPid(menuDO.getMenuId());
					menuVO.setChildren(children);		
					menuVOs.add(menuVO);
				}				
				
			}
		}				
		return menuVOs ;
	}

	@Override
	public List<MenuQueryVO> listChildrenByPid(String pid) throws Exception {
		List<MenuQueryVO> menuVOs=null;
		MenuDOExample example= new MenuDOExample();
		Criteria criteria=example.createCriteria();
		criteria.andParentIdEqualTo(pid);		
		List<MenuDO> menuDOs=menuMapper.selectByExample(example);
		if(menuDOs!=null) {
			menuVOs=new ArrayList<>();
			for(MenuDO menuDO:menuDOs) {
				MenuQueryVO menuVO=new MenuQueryVO();
				BeanUtils.copyProperties(menuDO, menuVO);
				menuVOs.add(menuVO);
			}
		}		
		
		return menuVOs ;
	}
	
	
}
