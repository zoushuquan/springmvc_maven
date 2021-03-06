package com.sufow.dao;

import java.util.List;
import java.util.Map;

import com.sufow.comm.CommParam;
import com.sufow.comm.CommResult;

public interface GoodsDao {

	/**
	 * 查询商品列表
	 * @return
	 */
	public List<Map<String,Object>> queryGoodsList(CommParam param);
	
	/***
	 * 入库
	 * @param param
	 * @return
	 */
	public CommResult addGoods(CommParam param);
	
	
	/***
	 * 出库
	 * @param param
	 * @return
	 */
	public CommResult reduceGoods(CommParam param);
	
}
