package com.cn.hx.wwj.web.pooh.dubbo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.cn.hx.wwj.facade.api.appuser.service.AppUserFacade;

/**
 * 调用服务暴露的接口配置
 * @author zhuqiuyou
 *
 */
@Configuration
public class DubboApiCustomerServiceConfig extends DubboApiCustomerConfig {

	@Bean
	public ReferenceBean<AppUserFacade> webUserServiceFacade() {
		ReferenceBean<AppUserFacade> referenceBean=new ReferenceBean<AppUserFacade>();
		
		referenceBean.setInterface(AppUserFacade.class.getName());
		referenceBean.setCluster("failover"); //集群容错机制 Failover; Failfast ; Failsafe ;Failback ;Forking ;Broadcast
		
		List<MethodConfig> methods=new ArrayList<MethodConfig>();
		
		/*** dubbo method listAllAppuserByRorlid config*/
		MethodConfig methodConfig=new MethodConfig();
		methodConfig.setName("listAllAppuserByRorlid");
		methodConfig.setTimeout(3000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig); //
		
		/*** dubbo method listPdPageUser config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("listPdPageUser");
		methodConfig.setTimeout(3000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig); //
		
		/*** dubbo method findByUsername config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("findByUsername");
		methodConfig.setTimeout(3000);
		methodConfig.setRetries(3);
		methods.add(methodConfig); //重试机制次数
		
		referenceBean.setMethods(methods);
		return referenceBean;
	}
}
