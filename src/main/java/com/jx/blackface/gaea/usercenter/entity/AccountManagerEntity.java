package com.jx.blackface.gaea.usercenter.entity;

import java.util.Date;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

@GaeaSerializable
@Table(name = "t_lvz_account_manager")
public class AccountManagerEntity {

	@GaeaMember
	@Id(insertable = true)
	@Column(name = "amid")
	private long amid;

	@GaeaMember
	@Column(name = "userid")
	private long userid;
	
	@GaeaMember
	@Column(name = "empid")
	private long empid;
	
	@GaeaMember
	@Column(name = "addtime")
	private Date addtime;
	
	@GaeaMember
	@Column(name = "beizhu")
	private String beizhu;
	
	@GaeaMember
	@Column(name = "intention")
	private int intention;
	
	@GaeaMember
	@Column(name = "tempStr")
	private String tempStr;
	
	@GaeaMember
	@Column(name = "updatetime")
	private Date updatetime;

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

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public String getTempStr() {
		return tempStr;
	}

	public void setTempStr(String tempStr) {
		this.tempStr = tempStr;
	}

	public int getIntention() {
		return intention;
	}

	public void setIntention(int intention) {
		this.intention = intention;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	
}
