package com.cn.hx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@ImportResource("classpath:config/spring-dataSource.xml")
@SpringBootApplication
public class WebHoopApplication extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebHoopApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(WebHoopApplication.class, args);
	}

	   @Bean
	    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		   
		   RedisTemplate redisTemplate = new RedisTemplate();
		   redisTemplate.setConnectionFactory(redisConnectionFactory);
	       
		   redisTemplate.setKeySerializer(new org.springframework.data.redis.serializer.StringRedisSerializer());
		   redisTemplate.setValueSerializer(new org.springframework.data.redis.serializer.StringRedisSerializer());
		   
		   redisTemplate.setHashKeySerializer(new org.springframework.data.redis.serializer.StringRedisSerializer());
		   redisTemplate.setHashValueSerializer(new org.springframework.data.redis.serializer.JdkSerializationRedisSerializer());
		   return redisTemplate;
	}
}
