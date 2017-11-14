package com.cn.hx.wwj.service.api.module.appuser.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hx.wwj.common.web.entity.Page;
import com.cn.hx.wwj.common.web.util.PageData;
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
		return (List<PageData>)appUserMapper.listPdPageUser(page);
	}
	
	/**通过用户名获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUsername(PageData pd)throws Exception{
		return (PageData)appUserMapper.findByUsername(pd);
	}
}

