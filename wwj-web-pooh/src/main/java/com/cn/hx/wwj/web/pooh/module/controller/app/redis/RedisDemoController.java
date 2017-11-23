package com.cn.hx.wwj.web.pooh.module.controller.app.redis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hx.wwj.common.web.util.AppUtil;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.redis.core.dao.RedisDao;
import com.cn.hx.wwj.web.pooh.module.controller.base.BaseController;

/** RedisDemo
 * @author FH Q313596790
 * 2016.5.8
 */
//@Controller
//@RequestMapping(value="/appRedisDemo")
public class RedisDemoController extends BaseController{
	
	@Resource(name = "redisDaoImpl")
	private RedisDao redisDaoImpl;
	
	/**
	 * 请讲接口 http://127.0.0.1:8080/项目名称/appRedisDemo/redisDemo.do
	 * demo展示的在redis存储读取数据的方式，本系统暂时用不到redis，此redis接口可根据实际业务需求选择使用
	 * 具体redis的应用场景->百度下即可
	 */
	@RequestMapping(value="/redisDemo")
	@ResponseBody
	public Object redis(){
		
		Map<String,Object> map = new HashMap<String,Object>();
		String result = "";
		
		
		return AppUtil.returnObject(new PageData(), map);
	}

}
