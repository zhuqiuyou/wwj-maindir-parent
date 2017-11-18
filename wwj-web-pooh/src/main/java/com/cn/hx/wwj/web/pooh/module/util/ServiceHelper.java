package com.cn.hx.wwj.web.pooh.module.util;

import com.cn.hx.wwj.common.web.util.Const;
import com.cn.hx.wwj.web.pooh.module.service.system.menu.impl.MenuService;
import com.cn.hx.wwj.web.pooh.module.service.system.role.impl.RoleService;
import com.cn.hx.wwj.web.pooh.module.service.system.user.UserManager;

/**
 * @author Administrator
 * 获取Spring容器中的service bean
 */
public final class ServiceHelper {
	
	public static Object getService(String serviceName){
		//WebApplicationContextUtils.
		return Const.WEB_APP_CONTEXT.getBean(serviceName);
	}
	
	public static UserManager getUserService(){
		return (UserManager) getService("userService");
	}
	
	public static RoleService getRoleService(){
		return (RoleService) getService("roleService");
	}
	
	public static MenuService getMenuService(){
		return (MenuService) getService("menuService");
	}
}
