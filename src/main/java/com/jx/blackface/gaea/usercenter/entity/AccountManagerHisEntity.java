package com.jx.blackface.gaea.usercenter.entity;

import java.util.Date;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

@GaeaSerializable
@Table(name = "t_lvz_account_manager_his")
public class AccountManagerHisEntity {

	@GaeaMember
	@Id(insertable = true)
	@Column(name = "id")
	private long id;
	
	@GaeaMember
	@Column(name = "amid")
	private long amid;

	@GaeaMember
	@Column(name = "userid")
	private long userid;
	
	@GaeaMember
	@Column(name = "empid")
	private long empid;
	
	@GaeaMember
	@Column(name = "hisempid")
	private long hisempid;
	
	@GaeaMember
	@Column(name = "addtime")
	private Date addtime;
	
	@GaeaMember
	@Column(name = "optioner")
	private long optioner;
	
	@GaeaMember
	@Column(name = "tempStr")
	private String tempStr;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAmid() {
		return amid;
	}

	public void setAmid(long amid) {
		this.amid = amid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public long getHisempid() {
		return hisempid;
	}

	public void setHisempid(long hisempid) {
		this.hisempid = hisempid;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public long getOptioner() {
		return optioner;
	}

	public void setOptioner(long optioner) {
		this.optioner = optioner;
	}

	public String getTempStr() {
		return tempStr;
	}

	public void setTempStr(String tempStr) {
		this.tempStr = tempStr;
	}
	
}
