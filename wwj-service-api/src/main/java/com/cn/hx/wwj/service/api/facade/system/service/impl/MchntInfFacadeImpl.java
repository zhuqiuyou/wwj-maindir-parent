package com.cn.hx.wwj.service.api.facade.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.facade.api.mchnt.entity.MchntInf;
import com.cn.hx.wwj.facade.api.mchnt.service.MchntInfFacade;
import com.cn.hx.wwj.service.api.module.mchnt.service.MchntInfService;

@Configuration  
@com.alibaba.dubbo.config.annotation.Service(interfaceName="mchntInfFacade")
public class MchntInfFacadeImpl implements MchntInfFacade {
	
	@Autowired
	@Qualifier("mchntInfService")
	private MchntInfService mchntInfService;

	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		mchntInfService.save(pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		mchntInfService.delete(pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		mchntInfService.edit(pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)mchntInfService.list(page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)mchntInfService.listAll(pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)mchntInfService.findById(pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		mchntInfService.deleteAll(ArrayDATA_IDS);
	}

	/**
	 * 通过AppNo标识来查找
	 * @param SN
	 * @return
	 * @throws Exception
	 */

	public MchntInf getMchntByAppNo(String appNo) throws Exception {
		return (MchntInf)mchntInfService.getMchntByAppNo(appNo);
	}

}
