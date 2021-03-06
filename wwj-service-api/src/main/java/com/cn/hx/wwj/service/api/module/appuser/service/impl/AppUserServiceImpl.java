package com.cn.hx.wwj.service.api.module.appuser.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.facade.api.appuser.entity.AppUser;
import com.cn.hx.wwj.mybatis.core.dao.BaseMapper;
import com.cn.hx.wwj.mybatis.core.service.impl.BaseServiceImpl;
import com.cn.hx.wwj.service.api.module.appuser.mapper.AppUserMapper;
import com.cn.hx.wwj.service.api.module.appuser.service.AppUserService;


@Service("appUserService")
public class AppUserServiceImpl extends BaseServiceImpl<AppUser> implements AppUserService{

	@Autowired
	private AppUserMapper appUserMapper;

	@Override
	protected BaseMapper<AppUser> getDao() {
		return appUserMapper;
	}
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllAppuserByRorlid(PageData pd) throws Exception {
		return appUserMapper.listAllAppuserByRorlid(pd);
	}
	
	/**会员列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listPdPageUser(Page page)throws Exception{
		return appUserMapper.userlistPage(page);
	}
	
	/**通过用户名获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUsername(PageData pd)throws Exception{
		return appUserMapper.findByUsername(pd);
	}
	
	/**通过邮箱获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByEmail(PageData pd)throws Exception{
		return appUserMapper.findByEmail(pd);
	}
	
	/**通过编号获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByNumber(PageData pd)throws Exception{
		return appUserMapper.findByNumber(pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		appUserMapper.save(pd);
	}
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		appUserMapper.delete(pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		appUserMapper.edit(pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return appUserMapper.findByUiId(pd);
	}
	
	/**全部会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllUser(PageData pd)throws Exception{
		return appUserMapper.listAllUser(pd);
	}
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		appUserMapper.deleteAll(USER_IDS);
	}
	
	/**获取总数
	 * @param value
	 * @throws Exception
	 */
	public PageData getAppUserCount(String value)throws Exception{
		return appUserMapper.getAppUserCount(value);
	}

	/**
	 * 注册用户
	 * @param phone
	 * @return
	 * @throws Exception
	 */

	public int reg(AppUser appUser) throws Exception {
		return appUserMapper.reg(appUser);
	}

	/**
	 * 通过手机号码查询用户信息
	 * @param phone
	 * @return
	 * @throws Exception
	 */

	public AppUser getUserByPhone(String phone) throws Exception {
		return appUserMapper.getUserByPhone(phone);
	}

	/**
	 * 通过ID查询用户信息
	 * @param id
	 * @return
	 * @throws Exception
	 */

	public AppUser getUserByID(String id) throws Exception {
		return appUserMapper.getUserByID(id);
	}

	/**
	 * 修改用户头像
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateAppUserImage(AppUser appUser) throws Exception {
		return appUserMapper.updateAppUserImage(appUser);
	}
}

