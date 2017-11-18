package com.cn.hx.wwj.mybatis.core.dao;

import java.util.List;


/**
 * 
 * @描述: 数据访问层基础支撑接口.
 * @作者: zhuqiuyou
 * @创建时间: 2017-7-22,下午4:52:52 .
 * @版本: 1.0 .
 * @param <T>
 */
public interface BaseMapper<T> {
	

	/**
	 * 保存对象
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public int save(T t);
	
	/**
	 * 批量更新
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public void batchSave(List list );
	
	/**
	 * 修改对象
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public int update(T t);

	/**
	 * 批量更新
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public void batchUpdate(List list );
	
	/**
	 * 批量删除
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public void batchDelete(List list);
	
	/**
	 * 删除对象 
	 * @param string
	 * @return
	 * @throws Exception
	 */
	public int delete(String id);
	
	
	/**
	 * 查找列表对象
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public List<T> listBy(T t);
	 
	/**
	 * 查找对象
	 * @param string
	 * @return
	 * @throws Exception
	 */
	public T findById(String id);

}
