package com.cn.hx.wwj.service.api.facade.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.facade.api.appuser.entity.AppUser;
import com.cn.hx.wwj.facade.api.appuser.service.AppUserFacade;
import com.cn.hx.wwj.service.api.module.appuser.service.AppUserService;

@Configuration  
@com.alibaba.dubbo.config.annotation.Service(interfaceName="appUserFacade")
public class AppUserFacadeImpl implements AppUserFacade {
	
	@Autowired
	@Qualifier("appUserService")
	private AppUserService appUserService;
	
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllAppuserByRorlid(PageData pd) throws Exception{
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
	
	/**通过邮箱获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByEmail(PageData pd)throws Exception{
		return appUserService.findByEmail(pd);
	}
	
	/**通过编号获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByNumber(PageData pd)throws Exception{
		return appUserService.findByNumber(pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		appUserService.save(pd);
	}
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		appUserService.delete(pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		appUserService.edit(pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return appUserService.findByUiId(pd);
	}
	
	/**全部会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllUser(PageData pd)throws Exception{
		return appUserService.listAllUser(pd);
	}
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		appUserService.deleteAll(USER_IDS);
	}
	
	/**获取总数
	 * @param value
	 * @throws Exception
	 */
	public PageData getAppUserCount(String value)throws Exception{
		return appUserService.getAppUserCount(value);
	}

	/**
	 * 通过手机号码注册用户信息
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	public int reg(AppUser appUser)throws Exception{
		return appUserService.reg(appUser);
	}

	/**
	 * 通过手机号码查询用户信息
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	public AppUser getUserByPhone(String phone)throws Exception{
		return appUserService.getUserByPhone(phone);
	}

	/**
	 * 通过ID获取用户信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public AppUser getUserByID(String id)throws Exception{
		return appUserService.getUserByID(id);
	}

	/**
	 * 更改头像
	 * @param appUser
	 * @return
	 * @throws Exception
	 */
	public int  updateAppUserImage(AppUser appUser)throws Exception{
		return appUserService.updateAppUserImage(appUser);
	}

}
