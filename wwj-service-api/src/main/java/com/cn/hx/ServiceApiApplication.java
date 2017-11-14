package com.cn.hx;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.cn.hx.wwj.*.*.module.*.mapper")
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@SpringBootApplication
public class ServiceApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceApiApplication.class, args);
	}
}
