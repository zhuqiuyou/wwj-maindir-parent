package com.cn.hx.wwj.facade.api.mchnt.service;
import java.util.List;

import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.facade.api.mchnt.entity.MchntInf;

/** 
 * 说明： 娃娃机处理类接口
 * 创建人：FH Q313596790
 * 创建时间：2017-10-27
 * @version
 */
public interface MchntInfFacade{

	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception;
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception;
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception;
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> list(Page page)throws Exception;
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listAll(PageData pd)throws Exception;
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception;
	
	/**
	 * 根据App标识查找所属商户
	 * @param appNo
	 * @return
	 * @throws Exception
	 */
	public MchntInf getMchntByAppNo(String appNo) throws Exception;

}