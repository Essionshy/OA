package com.yuhong.oa.dto;

import com.yuhong.oa.entity.DepartmentDO;
import com.yuhong.oa.entity.PositionDO;
import com.yuhong.oa.entity.UserDO;
import com.yuhong.oa.util.PageQuery;
import com.yuhong.oa.vo.UserQueryVO;
/**
 * 用户数据传输对象
 * @author William
 *
 */
public class UserDTO {
	//查询条件参数
	private UserQueryVO user;
	//分页参数
	private PageQuery pageQuery;
	
	
	@Override
	public String toString() {
		return "UserDTO [user=" + user + ", pageQuery=" + pageQuery + "]";
	}
	public UserQueryVO getUser() {
		return user;
	}
	public void setUser(UserQueryVO user) {
		this.user = user;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
	
		
}