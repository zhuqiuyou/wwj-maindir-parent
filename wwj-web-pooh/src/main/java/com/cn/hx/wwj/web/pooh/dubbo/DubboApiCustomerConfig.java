package com.cn.hx.wwj.web.pooh.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * 
 * @author zhuqiuyou
 *
 */
@Configuration
public class DubboApiCustomerConfig {

	@Autowired
	private DubboApiCustomerProperies dubboApiCustomerProperies;
	
	/**
	 * dubbo 注册的地址
	 * @return
	 */
	@Bean
	public RegistryConfig registry() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(dubboApiCustomerProperies.getRegistryAddress());
		registryConfig.setCheck(false);
		return registryConfig;
	}
	
	@Bean
	public ApplicationConfig application(){
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("wwj-dubbo-api-customer");
		return applicationConfig;
	}
	
	@Bean
	public ConsumerConfig customer(){
		ConsumerConfig consumerConfig=new ConsumerConfig();
		consumerConfig.setCheck(false);
		consumerConfig.setTimeout(dubboApiCustomerProperies.getProviderTimeout());
		return consumerConfig;
	}
}
