package com.cn.hx.wwj.web.pooh.module.sys.ctrl;

import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cn.hx.wwj.redis.core.dao.RedisDao;
import com.cn.hx.wwj.web.pooh.module.sys.model.User;

@Controller
@RequestMapping("/sys/")
public class SysUserCtrl {

	private static Logger log = LoggerFactory.getLogger(SysUserCtrl.class);

    @Autowired
    public RedisDao redisDao;

	@RequestMapping("/getById")
	@ResponseBody
	public String getById(Model model,HttpServletRequest request) {
		request.getSession().setAttribute("WEB_SESSION_USER", "zhuqiuyou");
		redisDao.addString("username", UUID.randomUUID().toString());
		System.out.println(redisDao.getString("username"));
		return "getById";
	}
	
	
	@RequestMapping("/hsave")
	@ResponseBody
	public String hsave(Model model) {
		User user=new User();
		String id=UUID.randomUUID().toString();
		user.setId(id);
		user.setUsername("测试");
		user.setPassword(UUID.randomUUID().toString());
		redisDao.hsetMap("REDIS_HSET_KEY", user.getId(), user);
		
		 Map<String,User> map=redisDao.getAllMap("REDIS_HSET_KEY");
		 System.out.println(JSON.toJSON(map).toString());
		return "getById";
	}
	
	

	
}
