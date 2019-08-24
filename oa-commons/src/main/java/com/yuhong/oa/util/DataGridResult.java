package com.yuhong.oa.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询数据返回JSON数据 封装类
 * 
 * @author William
 *
 */
@SuppressWarnings("rawtypes")
public class DataGridResult implements Serializable {

	private static final long serialVersionUID = 85181997633670822L;
	/**
	 * 操作结果信息
	 */
	private ResultMessage resultMessage;
	/**
	 * 查询列表总记录数
	 */
	private long total;
	/**
	 * 查询结果集
	 */

	private List rows = new ArrayList();

	public ResultMessage getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(ResultMessage resultMessage) {
		this.resultMessage = resultMessage;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

}
