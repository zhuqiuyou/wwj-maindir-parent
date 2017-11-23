package com.cn.hx.wwj.service.api.module.appuser.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.facade.api.appuser.entity.AppUser;
import com.cn.hx.wwj.mybatis.core.dao.BaseMapper;

@Mapper
public interface AppUserMapper extends BaseMapper<AppUser>{
	
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
	
}

