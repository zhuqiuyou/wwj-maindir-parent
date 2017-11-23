package com.cn.hx.wwj.web.pooh.module.service.system.doll.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.web.util.MyUUID;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.web.pooh.module.dao.DaoSupport;
import com.cn.hx.wwj.web.pooh.module.entity.system.Doll;
import com.cn.hx.wwj.web.pooh.module.service.system.doll.DollManager;

/** 
 * 说明： 娃娃机处理类
 * 创建人：FH Q313596790
 * 创建时间：2017-10-27
 * @version
 */
@Service("dollService")
public class DollService implements DollManager {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("DollMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("DollMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("DollMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("dolllistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("DollMapper.listAlllistPage", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("DollMapper.findById", pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("DollMapper.deleteAll", ArrayDATA_IDS);
	}

	/**
	 * 通过SN号来查询是否存在娃娃机
	 * @param SN
	 * @return
	 * @throws Exception
	 */

	public Doll getDollBySN(String SN) throws Exception {
		return (Doll)dao.findForObject("DollMapper.getDollBySN",SN);
	}

	/**
	 * 根据状态码获取娃娃机信息
	 * @param state
	 * @return
	 * @throws Exception
	 */
	@Override
	public Doll getDollByState(String state) throws Exception {
		return (Doll) dao.findForObject("DollMapper.getDollByState",state);
	}

	/**
	 * 根据id获取娃娃机房间信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Doll getDollByID(String id) throws Exception {
		return (Doll) dao.findForObject("DollMapper.getDollByState",id);
	}

	/**
	 * 获取所有娃娃机的信息
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Doll> getAllDoll() throws Exception {
		return (List<Doll> ) dao.findForList("DollMapper.getAllDoll",null);
	}

	/**
	 * 通过SN注册娃娃机
	 * @param sn
	 * @return
	 * @throws Exception
	 */
	@Override
	public int regDollBySN(String sn) throws Exception {
		return (int)dao.save("DollMapper.regDollBySN",new Doll("room_"+MyUUID.getUUID(),sn));
	}

	/**
	 * 通过网关表获取娃娃机在线的信息
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Doll> getDollBySessionOnLine() throws Exception {
		return (List<Doll>) dao.findForList("DollMapper.getDollBySessionOnLine",null);
	}
}

