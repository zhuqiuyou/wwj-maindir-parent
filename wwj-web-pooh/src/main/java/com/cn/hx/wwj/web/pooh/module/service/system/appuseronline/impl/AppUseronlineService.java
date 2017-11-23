package com.cn.hx.wwj.web.pooh.module.service.system.appuseronline.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.cn.hx.wwj.web.pooh.module.dao.DaoSupport;
import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.web.pooh.module.service.system.appuseronline.AppUseronlineManager;

/**
 * 说明： App用户在线
 * 创建时间：2017-11-08
 */
@Service("appuseronlineService")
public class AppUseronlineService implements AppUseronlineManager {

    @Resource(name = "daoSupport")
    private DaoSupport dao;


    /**
     * 列表
     *
     * @param page
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<PageData> list(Page page) throws Exception {
        return (List<PageData>) dao.findForList("AppUseronlineMapper.datalistPage", page);
    }

    /**
     * 列表(全部)
     *
     * @param pd
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<PageData> listAll(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("AppUseronlineMapper.listAll", pd);
    }
    /**
     * 通过id获取数据
     *
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd) throws Exception {
        return (PageData) dao.findForObject("AppUseronlineMapper.findById", pd);
    }


}

