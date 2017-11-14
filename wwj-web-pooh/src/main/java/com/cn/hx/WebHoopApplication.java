package com.cn.hx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@MapperScan("com.cn.hx.*.*.pooh.module.*.mapper")
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@SpringBootApplication
public class WebHoopApplication {

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