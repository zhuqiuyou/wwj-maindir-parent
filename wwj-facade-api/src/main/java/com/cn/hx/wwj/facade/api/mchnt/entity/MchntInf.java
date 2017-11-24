package com.cn.hx.wwj.facade.api.mchnt.entity;

import java.util.Date;

/**
 * 商户实体类
 * @author zhuqiuyou
 *
 */
public class MchntInf {
	
	/**
	 * 商户ID
	 */
	private String MCHNT_ID;
	
	/**
	 * 商户名称
	 */
	private String MCHNT_NAME;
	
	/**
	 * 对应APP名称
	 */
	private String APP_NAME;
	
	
	/**
	 * APP标识
	 */
	private String APP_NO;
	
	/**
	 * 商户状态
	 */
	private String MCHNT_STATE;


	/**
	 * 数据状态
	 */
	private String DATA_STAT;
	
	/**
	 * 创建时间
	 */
	protected Date CREATE_TIME;
	
	/**
	 * 创建人
	 */
	protected String CREATE_USER;
	
	/**
	 * 修改时间
	 */
	protected Date	UPDATE_TIME;
	
	/**
	 * 修改人
	 */
	protected String UPDATE_USER;
	
	/**
	 * 版本号
	 */
	private Integer LOCK_VERSION =0;

	public String getMCHNT_ID() {
		return MCHNT_ID;
	}

	public void setMCHNT_ID(String mCHNT_ID) {
		MCHNT_ID = mCHNT_ID;
	}

	public String getMCHNT_NAME() {
		return MCHNT_NAME;
	}

	public void setMCHNT_NAME(String mCHNT_NAME) {
		MCHNT_NAME = mCHNT_NAME;
	}

	public String getAPP_NAME() {
		return APP_NAME;
	}

	public void setAPP_NAME(String aPP_NAME) {
		APP_NAME = aPP_NAME;
	}

	public String getAPP_NO() {
		return APP_NO;
	}

	public void setAPP_NO(String aPP_NO) {
		APP_NO = aPP_NO;
	}

	public String getMCHNT_STATE() {
		return MCHNT_STATE;
	}

	public void setMCHNT_STATE(String mCHNT_STATE) {
		MCHNT_STATE = mCHNT_STATE;
	}

	public String getDATA_STAT() {
		return DATA_STAT;
	}

	public void setDATA_STAT(String dATA_STAT) {
		DATA_STAT = dATA_STAT;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	public String getCREATE_USER() {
		return CREATE_USER;
	}

	public void setCREATE_USER(String cREATE_USER) {
		CREATE_USER = cREATE_USER;
	}

	public Date getUPDATE_TIME() {
		return UPDATE_TIME;
	}

	public void setUPDATE_TIME(Date uPDATE_TIME) {
		UPDATE_TIME = uPDATE_TIME;
	}

	public String getUPDATE_USER() {
		return UPDATE_USER;
	}

	public void setUPDATE_USER(String uPDATE_USER) {
		UPDATE_USER = uPDATE_USER;
	}

	public Integer getLOCK_VERSION() {
		return LOCK_VERSION;
	}

	public void setLOCK_VERSION(Integer lOCK_VERSION) {
		LOCK_VERSION = lOCK_VERSION;
	}
}
