package com.cn.hx.wwj.mybatis.core.service;

import java.util.List;


/**
 * 基类Service接口
 * 
 * @author Hill
 * 
 * @param <T>
 */
public interface BaseService<T> {

	
	/**
	 * 根据ID查找记录.
	 * 
	 * @param id
	 *            .
	 * @return entity .
	 */
	T getById(String id);


	/**
	 * 根据实体对象新增记录.
	 * 
	 * @param entity
	 *            .
	 * @return id .
	 */
	long insert(T entity);

	/**
	 * 批量保存对象.
	 * 
	 * @param entity
	 *            .
	 * @return id .
	 */
	void insertBatch(List<T> list);

	/**
	 * 更新实体对应的记录.
	 * 
	 * @param entity
	 *            .
	 * @return
	 */
	long update(T entity);

	/**
	 * 批量更新对象.
	 * 
	 * @param entity
	 *            .
	 * @return int .
	 */
	void updateBatch(List<T> list);


	/**
	 * 根据ID删除记录.
	 * 
	 * @param id
	 *            .
	 * @return
	 */
	long deleteById(String  id);
	
  	/**
  	 * 查詢列表数据
  	 * @param t
  	 * @return
  	 */
  	List<T> getList(T t);
}
