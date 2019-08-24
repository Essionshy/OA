package com.yuhong.oa.util;

/**
 * 分页查询工具类
 * 
 * @author William
 *
 */
public class PageQuery {
	private static final Integer DEFAULT_START_PAGE = 1;
	private Integer currentPage;// 当前页码
	private Integer pageSize;// 页面大小
	private Long total;// 总记录数
	private Integer totalPage;// 总页数
	private Integer startPage;// 起始数

	/**
	 * 设置参数
	 * 
	 * @param currentPage
	 * @param pageSize
	 * @param total
	 */
	public void setPageParams(Integer currentPage, Integer pageSize, Long total) {

		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.total = total;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	/**
	 * 总页数
	 * 
	 * @return
	 */
	public Integer getTotalPage() {
		// 根据总记录数与每页显示数据大小求得
		return (null != total && null != pageSize) ?(int) (total % pageSize == 0 ? total / pageSize : (total / pageSize) + 1):0;

	}

	public Integer getStartPage() {
		return (null != currentPage && null != pageSize) ? (currentPage - 1) * pageSize : DEFAULT_START_PAGE;
	}

}
