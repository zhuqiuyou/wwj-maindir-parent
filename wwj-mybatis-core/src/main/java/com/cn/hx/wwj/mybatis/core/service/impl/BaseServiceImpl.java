package com.cn.hx.wwj.mybatis.core.service.impl;

import java.util.List;

import com.cn.hx.wwj.mybatis.core.dao.BaseMapper;
import com.cn.hx.wwj.mybatis.core.service.BaseService;



/**
 * Service 基类实现
 * 
 * @author zhuqiuyou
 * 
 * @param <T>
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	protected abstract BaseMapper<T> getDao();

	public T getById(String id){
		return this.getDao().findById(id);
	}


	/**
	 * 根据实体对象新增记录.
	 * 
	 * @param entity
	 *            .
	 * @return id .
	 */
	public long insert(T entity){
		return this.getDao().save(entity);
	}

	/**
	 * 批量保存对象.
	 * 
	 * @param entity
	 *            .
	 * @return id .
	 */
	public void insertBatch(List<T> list){
		this.getDao().batchSave(list);
	}

	/**
	 * 更新实体对应的记录.
	 * 
	 * @param entity
	 *            .
	 * @return
	 */
	public long update(T entity){
		return this.getDao().update(entity);
	}

	/**
	 * 批量更新对象.
	 * @param entity
	 * @return int .
	 */
	public void updateBatch(List<T> list){
		this.getDao().batchUpdate(list);
	}


	/**
	 * 根据ID删除记录.
	 * 
	 * @param id
	 *            .
	 * @return
	 */
	public long deleteById(String id){
		return this.getDao().delete(id);
	}
	
  	/**
  	 * 查詢列表数据
  	 * @param t
  	 * @return
  	 */
  	public List<T> getList(T t){
  		return this.getDao().listBy(t);
  	}
}
