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
	 * 根据ID查找记录.
	 * 
	 * @param id
	 *            .
	 * @return entity .
	 */
 	T getById(long id);

	/**
	 * 根据ID删除记录.
	 * 
	 * @param id
	 *            .
	 * @return
	 */
  	long deleteById(long id);
  	
  	/**
  	 * 查詢列表数据
  	 * @param t
  	 * @return
  	 */
  	List<T> listBy(T t);
}
