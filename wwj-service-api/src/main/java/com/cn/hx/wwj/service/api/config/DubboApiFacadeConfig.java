package com.cn.hx.wwj.service.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.cn.hx.wwj.facade.api.appuser.service.AppUserFacade;

/**
 * 服务暴露的接口 配置
 * @author zhuqiuyou
 *
 */
@Configuration
public class DubboApiFacadeConfig extends DubboApiProvideConfig {

	@Bean
	public ServiceBean<AppUserFacade> userServiceFacade(AppUserFacade appUserFacade) {
		ServiceBean<AppUserFacade> serviceBean=new ServiceBean<AppUserFacade>();
		
		serviceBean.setInterface(AppUserFacade.class.getName());
		serviceBean.setRef(appUserFacade);
		serviceBean.setCluster("failover"); //集群容错机制 Failover; Failfast ; Failsafe ;Failback ;Forking ;Broadcast
		
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
		
		
		serviceBean.setMethods(methods);
		return serviceBean;
	}
}
