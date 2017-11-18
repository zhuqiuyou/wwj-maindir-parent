package com.cn.hx.wwj.web.pooh.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cn.hx.wwj.web.pooh.module.interceptor.shiro.ShiroRealm;

@Configuration
public class ShiroConfig {
	
	
    /**
     * ShiroFilterFactoryBean 处理拦截资源文件问题。
     * 注意：单独一个ShiroFilterFactoryBean配置是或报错的，以为在
     * 初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager
     * Filter Chain定义说明 1、一个URL可以配置多个Filter，使用逗号分隔 2、当设置多个过滤器时，全部验证通过，才视为通过
     */
    @Bean
    public ShiroFilterFactoryBean shirFilter(org.apache.shiro.mgt.SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 必须设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
        shiroFilterFactoryBean.setLoginUrl("/");
        // 登录成功后要跳转的链接
        shiroFilterFactoryBean.setSuccessUrl("/main/index");
        // 未授权界面;
        shiroFilterFactoryBean.setUnauthorizedUrl("/login_toLogin");

        // 拦截器.
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        
        // 配置不会被拦截的链接 顺序判断
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/plugins/**", "anon");
        filterChainDefinitionMap.put("/uploadFiles/**", "anon");
		filterChainDefinitionMap.put("/login*", "anon");
		filterChainDefinitionMap.put("/code*", "anon");
		filterChainDefinitionMap.put("/app**/**", "anon");
		filterChainDefinitionMap.put("/gateway**/**", "anon");
		filterChainDefinitionMap.put("/weixin/**", "anon");
		filterChainDefinitionMap.put("/sms/**", "anon");
		  filterChainDefinitionMap.put("/uploadFiles/DollImage/**", "anon");
		  filterChainDefinitionMap.put("/uploadFiles/appUserImage/**", "anon");
		  filterChainDefinitionMap.put("/doll/**", "anon");
		  filterChainDefinitionMap.put("/api/**", "anon");
		  filterChainDefinitionMap.put("/error", "anon");

        // 配置退出过滤器,其中的具体的退出代码Shiro已经替我们实现了
        filterChainDefinitionMap.put("/logout", "logout");

        // <!-- 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
        // <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
        filterChainDefinitionMap.put("/**", "authc");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
    	DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(shiroRealm());
        return securityManager;
    }

    /**
     * 身份认证realm; (这个需要自己写，账号密码校验；权限等)
     * @return
     */
    @Bean
    public ShiroRealm shiroRealm() {
    	ShiroRealm myShiroRealm = new ShiroRealm();
        return myShiroRealm;
    }
}