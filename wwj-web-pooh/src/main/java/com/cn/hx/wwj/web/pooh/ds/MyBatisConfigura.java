package com.cn.hx.wwj.web.pooh.ds;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class MyBatisConfigura {
	
//	/**
//	 * 数据源配置
//	 * @return
//	 */
//
//	@ConfigurationProperties(prefix="spring.datasource") //加载数据源连接配置
//	@Bean(name="dataSource")
//	public DataSource dataSource() {
//		DruidDataSource datasource = new DruidDataSource();
//		return datasource;
//	}
//	
//	@Bean(name="sqlSessionFactory")
//    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        
//        sessionFactory.setConfigLocation(new ClassPathResource("/config/mybatis-config.xml"));   
//        
//      //添加XML目录
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        try {
//        	sessionFactory.setMapperLocations(resolver.getResources("classpath:mybatis1/*/*Mapper.xml"));
//            return sessionFactory;
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Bean(name="sqlSessionTemplate")
//    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
//    	SqlSessionTemplate sqlSessionTemplate=new SqlSessionTemplate(sqlSessionFactory().getObject());
//    	return sqlSessionTemplate;
//    }

}
