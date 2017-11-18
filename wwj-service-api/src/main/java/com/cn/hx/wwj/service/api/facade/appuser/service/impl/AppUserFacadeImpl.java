package com.cn.hx.wwj.service.api.facade.appuser.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import com.cn.hx.wwj.common.web.entity.Page;
import com.cn.hx.wwj.common.web.util.PageData;
import com.cn.hx.wwj.facade.api.appuser.service.AppUserFacade;
import com.cn.hx.wwj.service.api.module.appuser.service.AppUserService;

@Configuration  
@com.alibaba.dubbo.config.annotation.Service(interfaceName="appUserFacade")
public class AppUserFacadeImpl implements AppUserFacade {
	
	@Autowired
	@Qualifier("appUserService")
	private AppUserService appUserService;
	
	@Override
	public List<PageData> listAllAppuserByRorlid(PageData pd) throws Exception {
		return appUserService.listAllAppuserByRorlid(pd);
	}
	
	/**会员列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listPdPageUser(Page page)throws Exception{
		return appUserService.listPdPageUser(page);
	}
	
	/**通过用户名获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUsername(PageData pd)throws Exception{
		return appUserService.findByUsername(pd);
	}
}
