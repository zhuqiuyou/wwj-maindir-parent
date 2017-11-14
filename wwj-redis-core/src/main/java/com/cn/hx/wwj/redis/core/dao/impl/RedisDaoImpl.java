package com.cn.hx.wwj.redis.core.dao.impl;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.cn.hx.wwj.redis.core.dao.RedisDao;


@Component("redisDao")
public class RedisDaoImpl<T> implements RedisDao<T>{
	
    @Autowired
    public RedisTemplate redisTemplate;
    
	/**新增(存储字符串)
	 * @param key
	 * @param value
	 * @return
	 */
	@Override
	public void addString(String key,String value) {
		redisTemplate.opsForValue().set(key,value);
	}
	
	/**
	 * 	Strings	新增 设置失效时间
	 * @param key
	 * @param value
	 * @param timeout
	 * @return
	 */
	public void addString(String key, String value, long timeout){
		redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
	}
	
	/**strings get 字符串
	 * @param key
	 * @param value
	 * @return
	 */
	public String getString(String key){
		return (String) redisTemplate.opsForValue().get(key);
	}
	
	/**hashes 新增(存储Map)
	 * @param key
	 * @param map
	 * @return
	 */
	@Override
	public void addAllMap(String key, Map<String, T> map){
		redisTemplate.opsForHash().putAll(key, map);
	}
	
	/**hashes 获取 all
	 * @param key
	 * @return
	 */
	public Map<String,T> getAllMap(String key){
		return (Map<String, T>) redisTemplate.opsForHash().entries(key);
	}
	
	/**hashes 新增(存储单个对象)
	 * @param key
	 * @param map
	 * @return
	 */
	public void hsetMap(String h,String hk,T value){
		redisTemplate.opsForHash().put(h, hk, value);
	}
	
	/**hashes 获取单个对象
	 * @param key
	 * @return
	 */
	public T hgetMap(String h,String hk){
		return (T)redisTemplate.opsForHash().get(h,hk);
	}

}
