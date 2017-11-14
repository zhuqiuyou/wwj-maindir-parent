package com.cn.hx.wwj.redis.core.dao;

import java.util.Map;

/** 
 * 说明： redisTemplate操作类
 * 创建人：zhuqiuyou
 * 创建时间：2017-11-10
 * @version
 */
public interface RedisDao<T> {
	
	/**strings 新增(存储字符串)
	 * @param key
	 * @param value
	 * @return
	 */
	public void addString(String key, String value);
	
	/**
	 * 	Strings	新增 设置失效时间
	 * @param key
	 * @param value
	 * @param timeout
	 */
	public void addString(String key, String value, long timeout);
	
	
	/**strings get 字符串
	 * @param key
	 * @param value
	 * @return
	 */
	public String getString(String key);
	
	
	/**hashes 新增(存储Map)
	 * @param key
	 * @param map
	 * @return
	 */
	public void addAllMap(String key, Map<String, T> map);
	
	
	/**hashes 获取 all
	 * @param key
	 * @return
	 */
	public Map<String,T> getAllMap(String key);
	
	/**hashes 新增(存储单个对象)
	 * @param key
	 * @param map
	 * @return
	 */
	public void hsetMap(String h,String hk,T value);
	
	
	/**hashes 获取单个对象
	 * @param key
	 * @return
	 */
	public T hgetMap(String h,String hk);
	
	
//	/**新增(存储List)
//	 * @param key
//	 * @param list
//	 * @return
//	 */
//	public void addList(String key, List<T> list);
//	
//	/**获取List
//	 * @param key
//	 * @return
//	 */
//	public List<String> getList(String key);
//	
//	/**新增(存储set)
//	 * @param key
//	 * @param set
//	 */
//	public void addSet(String key, Set<String> set);
//	
//	/**获取Set
//	 * @param key
//	 * @return
//	 */
//	public Set<String> getSet(String key);
//	
//	/**删除
//	 * @param key
//	 */
//	public boolean delete(String key); 
//	
//	/**删除多个 
//	 * @param keys
//	 */
//	public void delete(List<String> keys);
//	
//	/**修改
//	 * @param pd
//	 * @return
//	 */
//	public boolean eidt(String key, String value);
//	
//	/**通过ket获取数据
//	 * @param keyId
//	 * @return
//	 */
//	public String get(String keyId);

}
