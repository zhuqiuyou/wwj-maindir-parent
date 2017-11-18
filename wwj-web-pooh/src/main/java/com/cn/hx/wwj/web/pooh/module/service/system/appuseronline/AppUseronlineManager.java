package com.cn.hx.wwj.web.pooh.module.service.system.appuseronline;

import java.util.List;

import com.cn.hx.wwj.common.web.entity.Page;
import com.cn.hx.wwj.common.web.util.PageData;

/**
 * 说明： APP用户在线接口
 * 创建时间：2017-11-08
 */
public interface AppUseronlineManager {


    /**
     * 列表
     *
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page) throws Exception;

    /**
     * 列表(全部)
     *
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd) throws Exception;

    /**
     * 通过id获取数据
     *
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd) throws Exception;


}

