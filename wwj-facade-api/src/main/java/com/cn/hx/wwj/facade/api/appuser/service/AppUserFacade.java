package com.cn.hx.wwj.facade.api.appuser.service;

import java.util.List;

import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.facade.api.appuser.entity.AppUser;

public interface AppUserFacade {
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllAppuserByRorlid(PageData pd) throws Exception;
	
	/**会员列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listPdPageUser(Page page)throws Exception;
	
	/**通过用户名获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUsername(PageData pd)throws Exception;
	
	/**通过邮箱获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByEmail(PageData pd)throws Exception;
	
	/**通过编号获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByNumber(PageData pd)throws Exception;
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception;
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception;
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception;
	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception;
	
	/**全部会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllUser(PageData pd)throws Exception;
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception;
	
	/**获取总数
	 * @param value
	 * @throws Exception
	 */
	public PageData getAppUserCount(String value)throws Exception;

	/**
	 * 通过手机号码注册用户信息
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	public int reg(AppUser appUser)throws Exception;

	/**
	 * 通过手机号码查询用户信息
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	public AppUser getUserByPhone(String phone)throws Exception;

	/**
	 * 通过ID获取用户信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public AppUser getUserByID(String id)throws Exception;

	/**
	 * 更改头像
	 * @param appUser
	 * @return
	 * @throws Exception
	 */
	public int  updateAppUserImage(AppUser appUser)throws Exception;
}

