package com.cn.hx.wwj.service.api.module.mchnt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.facade.api.mchnt.entity.MchntInf;
import com.cn.hx.wwj.service.api.module.mchnt.mapper.MchntInfMapper;
import com.cn.hx.wwj.service.api.module.mchnt.service.MchntInfService;


@Service("mchntInfService")
public class MchntInfServiceImpl implements MchntInfService {

	@Autowired
	private MchntInfMapper mchntInfMapper;

	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		mchntInfMapper.save(pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		mchntInfMapper.delete(pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		mchntInfMapper.edit(pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)mchntInfMapper.listPage(page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)mchntInfMapper.listAllPage(pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)mchntInfMapper.findById(pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		mchntInfMapper.deleteAll(ArrayDATA_IDS);
	}

	/**
	 * 通过AppNo标识来查找
	 * @param SN
	 * @return
	 * @throws Exception
	 */

	public MchntInf getMchntByAppNo(String appNo) throws Exception {
		return (MchntInf)mchntInfMapper.getMchntByAppNo(appNo);
	}


}

