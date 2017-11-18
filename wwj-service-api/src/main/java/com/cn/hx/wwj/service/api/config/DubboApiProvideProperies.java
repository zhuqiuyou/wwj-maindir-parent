package com.cn.hx.wwj.service.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboApiProvideProperies {

	@Value("${spring.dubbo.api.application.name}")
	private String applicationName;
	
	@Value("${spring.dubbo.api.protocol.facade.name}")
	private String protocolName;
	
	@Value("${spring.dubbo.api.protocol.facade.port}")
	private int protocolPort;
	
	@Value("${spring.dubbo.api.protocol.facade.accepts}")
	private int protocolAccepts;
	
	@Value("${spring.dubbo.api.provider.facade.timeout}")
	private int providerTimeout;
	
	@Value("${spring.dubbo.api.provider.facade.delay}")
	private int providerDelay;
	
	@Value("${spring.dubbo.api.registry.address}")
	private String registryAddress;


	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getProtocolName() {
		return protocolName;
	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	public int getProtocolPort() {
		return protocolPort;
	}

	public void setProtocolPort(int protocolPort) {
		this.protocolPort = protocolPort;
	}

	public int getProtocolAccepts() {
		return protocolAccepts;
	}

	public void setProtocolAccepts(int protocolAccepts) {
		this.protocolAccepts = protocolAccepts;
	}

	public int getProviderTimeout() {
		return providerTimeout;
	}

	public void setProviderTimeout(int providerTimeout) {
		this.providerTimeout = providerTimeout;
	}

	public int getProviderDelay() {
		return providerDelay;
	}

	public void setProviderDelay(int providerDelay) {
		this.providerDelay = providerDelay;
	}

	public String getRegistryAddress() {
		return registryAddress;
	}

	public void setRegistryAddress(String registryAddress) {
		this.registryAddress = registryAddress;
	}
}
