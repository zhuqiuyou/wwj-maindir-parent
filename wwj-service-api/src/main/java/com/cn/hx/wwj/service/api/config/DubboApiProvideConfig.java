package com.cn.hx.wwj.service.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * dubbo 服务提供者 注册配置
 * @author Administrator
 *
 */
@Configuration
public class DubboApiProvideConfig {

	@Autowired
	private DubboApiProvideProperies dubboApiProvideProperies;
	
	/**
	 * dubbo 注册的地址
	 * @return
	 */
	@Bean
	public RegistryConfig registry() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(dubboApiProvideProperies.getRegistryAddress());
		return registryConfig;
	}
	
	@Bean
	public ApplicationConfig application(){
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName(dubboApiProvideProperies.getApplicationName());
		return applicationConfig;
	}
	
	@Bean
	public ProtocolConfig protocol(){
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName(dubboApiProvideProperies.getProtocolName());
		protocolConfig.setPort(dubboApiProvideProperies.getProtocolPort());
		protocolConfig.setAccepts(dubboApiProvideProperies.getProtocolAccepts());
		return protocolConfig;
	}
	
	@Bean
	public ProviderConfig provider(){
		ProviderConfig providerConfig=new ProviderConfig();
		providerConfig.setProtocol(protocol());
		providerConfig.setTimeout(dubboApiProvideProperies.getProviderTimeout());
		providerConfig.setDelay(dubboApiProvideProperies.getProviderDelay());
		return providerConfig;
	}
}
