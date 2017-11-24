package com.cn.hx.wwj.service.api.module.doll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.facade.api.doll.entity.Doll;
import com.cn.hx.wwj.service.api.module.doll.mapper.DollMapper;
import com.cn.hx.wwj.service.api.module.doll.service.DollService;

/** 
 * 说明： 娃娃机处理类
 * 创建人：FH Q313596790
 * 创建时间：2017-10-27
 * @version
 */
@Service("dollService")
public class DollServiceImpl implements DollService {


	@Autowired
	private DollMapper dollMapper;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dollMapper.save(pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dollMapper.delete(pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dollMapper.edit(pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return dollMapper.dolllistPage(page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return dollMapper.listAlllistPage(pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return dollMapper.findById(pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dollMapper.deleteAll(ArrayDATA_IDS);
	}

	/**
	 * 通过SN号来查询是否存在娃娃机
	 * @param SN
	 * @return
	 * @throws Exception
	 */

	public Doll getDollBySN(String SN) throws Exception {
		return dollMapper.getDollBySN(SN);
	}

	/**
	 * 根据状态码获取娃娃机信息
	 * @param state
	 * @return
	 * @throws Exception
	 */
	@Override
	public Doll getDollByState(String state) throws Exception {
		return dollMapper.getDollByState(state);
	}

	/**
	 * 根据id获取娃娃机房间信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Doll getDollByID(String id) throws Exception {
		return dollMapper.getDollByState(id);
	}

	/**
	 * 获取所有娃娃机的信息
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Doll> getAllDoll() throws Exception {
		return dollMapper.getAllDoll();
	}

	/**
	 * 通过SN注册娃娃机
	 * @param sn
	 * @return
	 * @throws Exception
	 */
	@Override
	public int regDollBySN(Doll doll) throws Exception {
		return dollMapper.regDollBySN(doll);
	}

	/**
	 * 通过网关表获取娃娃机在线的信息
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Doll> getDollBySessionOnLine() throws Exception {
		return dollMapper.getDollBySessionOnLine();
	}
}

