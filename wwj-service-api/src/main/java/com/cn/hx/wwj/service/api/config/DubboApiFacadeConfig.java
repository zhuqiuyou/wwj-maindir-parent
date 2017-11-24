package com.cn.hx.wwj.service.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.cn.hx.wwj.facade.api.appuser.service.AppUserFacade;
import com.cn.hx.wwj.facade.api.doll.service.DollFacade;
import com.cn.hx.wwj.facade.api.mchnt.service.MchntInfFacade;

/**
 * 服务暴露的接口 配置
 * @author zhuqiuyou
 *
 */
@Configuration
public class DubboApiFacadeConfig extends DubboApiProvideConfig {

	/**
	 * appUserFacade 接口方法配置
	 * @param appUserFacade
	 * @return
	 */
	@Bean
	public ServiceBean<AppUserFacade> appUserFacadeBean(AppUserFacade appUserFacade) {
		ServiceBean<AppUserFacade> appUserServiceBean=new ServiceBean<AppUserFacade>();
		
		appUserServiceBean.setInterface(AppUserFacade.class.getName());
		appUserServiceBean.setRef(appUserFacade);
		appUserServiceBean.setCluster("failover"); //集群容错机制 Failover; Failfast ; Failsafe ;Failback ;Forking ;Broadcast
		
		List<MethodConfig> methods=new ArrayList<MethodConfig>();
		
		/*** AppUserFacade method listAllAppuserByRorlid config*/
		MethodConfig methodConfig=new MethodConfig();
		methodConfig.setName("listAllAppuserByRorlid");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** AppUserFacade method listPdPageUser config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("listPdPageUser");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** AppUserFacade method findByUsername config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("findByUsername");
		methodConfig.setTimeout(15000);//重试机制次数
		methodConfig.setRetries(3);
		methods.add(methodConfig); 
		
		/*** AppUserFacade method findByEmail config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("findByEmail");
		methodConfig.setTimeout(10000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** AppUserFacade method findByNumber config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("findByNumber");
		methodConfig.setTimeout(10000);
		methodConfig.setRetries(3);//重试机制次数
		methods.add(methodConfig); 
		
		
		/*** AppUserFacade method save config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("save");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(0); //重试机制次数
		methods.add(methodConfig);
		
		/*** AppUserFacade method delete config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("delete");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		
		/*** AppUserFacade method edit config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("edit");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(0); //重试机制次数
		methods.add(methodConfig);
		
		
		/*** AppUserFacade method findByUiId config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("findByUiId");
		methodConfig.setTimeout(10000);
		methodConfig.setRetries(3);//重试机制次数
		methods.add(methodConfig);
		
		/*** AppUserFacade method listAllUser config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("listAllUser");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3);//重试机制次数
		methods.add(methodConfig);
		
		/*** AppUserFacade method deleteAll config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("deleteAll");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3);//重试机制次数
		methods.add(methodConfig);
		
		
		/*** AppUserFacade method getAppUserCount config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("getAppUserCount");
		methodConfig.setTimeout(10000);
		methodConfig.setRetries(3);//重试机制次数
		methods.add(methodConfig);
		
		
		/*** AppUserFacade method reg config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("reg");
		methodConfig.setTimeout(10000);
		methodConfig.setRetries(0);//重试机制次数
		methods.add(methodConfig);
		
		
		/*** AppUserFacade method getUserByPhone config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("getUserByPhone");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3);//重试机制次数
		methods.add(methodConfig);
		
		
		/*** AppUserFacade method getUserByID config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("getUserByID");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3);//重试机制次数
		methods.add(methodConfig);
		
		
		/*** AppUserFacade method updateAppUserImage config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("updateAppUserImage");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(0);//重试机制次数
		methods.add(methodConfig);
		
		appUserServiceBean.setMethods(methods);
		return appUserServiceBean;
	}
	
	/**
	 * dollFacade 接口方法配置
	 * @param appUserFacade
	 * @return
	 */
	@Bean
	public ServiceBean<DollFacade> dollFacadeBean(DollFacade dollFacade) {
		ServiceBean<DollFacade> dollFacadeBean=new ServiceBean<DollFacade>();
		
		dollFacadeBean.setInterface(DollFacade.class.getName());
		dollFacadeBean.setRef(dollFacade);
		dollFacadeBean.setCluster("failover"); //集群容错机制 Failover; Failfast ; Failsafe ;Failback ;Forking ;Broadcast
		
		List<MethodConfig> methods=new ArrayList<MethodConfig>();
		
		
		/*** dollFacade method save config*/
		MethodConfig methodConfig=new MethodConfig();
		methodConfig.setName("save");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(0); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method delete config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("delete");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method deleteAll config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("deleteAll");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(0); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method edit config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("edit");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(0); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method list config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("list");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method listAll config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("listAll");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method findById config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("findById");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method getDollBySN config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("getDollBySN");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		
		/*** dollFacade method getDollByState config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("getDollByState");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method getDollByID config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("getDollByID");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		
		/*** dollFacade method getAllDoll config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("getAllDoll");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		
		/*** dollFacade method regDollBySN config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("regDollBySN");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(0); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method getDollBySessionOnLine config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("getDollBySessionOnLine");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		dollFacadeBean.setMethods(methods);
		return dollFacadeBean;
	}
	
	
	/**
	 * dollFacade 接口方法配置
	 * @param appUserFacade
	 * @return
	 */
	@Bean
	public ServiceBean<MchntInfFacade> mchntInfFacadeBean(MchntInfFacade mchntInfFacade) {
		ServiceBean<MchntInfFacade> mchntInfFacadeBean=new ServiceBean<MchntInfFacade>();
		
		mchntInfFacadeBean.setInterface(MchntInfFacade.class.getName());
		mchntInfFacadeBean.setRef(mchntInfFacade);
		mchntInfFacadeBean.setCluster("failover"); //集群容错机制 Failover; Failfast ; Failsafe ;Failback ;Forking ;Broadcast
		
		List<MethodConfig> methods=new ArrayList<MethodConfig>();
		
		/*** mchntInfFacade method save config*/
		MethodConfig methodConfig=new MethodConfig();
		methodConfig.setName("save");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(0); //重试机制次数
		methods.add(methodConfig);
		
		/*** mchntInfFacade method delete config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("delete");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** dollFacade method deleteAll config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("deleteAll");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(0); //重试机制次数
		methods.add(methodConfig);
		
		/*** mchntInfFacade method edit config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("edit");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(0); //重试机制次数
		methods.add(methodConfig);
		
		/*** mchntInfFacade method list config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("list");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** mchntInfFacade method listAll config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("listAll");
		methodConfig.setTimeout(15000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** mchntInfFacade method findById config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("findById");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		/*** mchntInfFacade method getMchntByAppNo config*/
		methodConfig=new MethodConfig();
		methodConfig.setName("getMchntByAppNo");
		methodConfig.setTimeout(5000);
		methodConfig.setRetries(3); //重试机制次数
		methods.add(methodConfig);
		
		
		mchntInfFacadeBean.setMethods(methods);
		return mchntInfFacadeBean;
	}
	
}
