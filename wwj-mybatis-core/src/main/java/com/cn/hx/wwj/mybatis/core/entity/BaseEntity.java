package com.cn.hx.wwj.mybatis.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @描述: 基础实体类，包含各实体公用属性 .
 * @作者: zhuqiuyou
 * @创建时间: 2017-8-5
 * @版本: 1.0
 */
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	/**
	 * 数据状态 0:可用,1:不可用
	 */
	protected String dataStat="0";
	/**
	 * 创建时间
	 */
	protected Date createTime;
	
	/**
	 * 创建人
	 */
	protected String createUser;
	
	/**
	 * 修改时间
	 */
	protected Date	updateTime;
	
	/**
	 * 修改人
	 */
	protected String updateUser;
	
	/**
	 * 版本号
	 */
	private Integer version =0;
	
	/**
	 * 是否开启行锁
	 */
	private boolean isPessimist=false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataStat() {
		return dataStat;
	}

	public void setDataStat(String dataStat) {
		this.dataStat = dataStat;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public boolean isPessimist() {
		return isPessimist;
	}

	public void setPessimist(boolean isPessimist) {
		this.isPessimist = isPessimist;
	}
	
}
