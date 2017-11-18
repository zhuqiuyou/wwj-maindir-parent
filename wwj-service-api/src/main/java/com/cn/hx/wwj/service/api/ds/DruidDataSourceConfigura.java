package com.cn.hx.wwj.service.api.ds;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidDataSourceConfigura {
	
	/**
	 * 数据源配置
	 * @return
	 */
	@Bean// 声明其为Bean实例
	@Primary // 在同样的DataSource中，首先使用被标注的DataSource
	@ConfigurationProperties(prefix="spring.datasource") //加载数据源连接配置
	public DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource();
		return datasource;
	}
}
