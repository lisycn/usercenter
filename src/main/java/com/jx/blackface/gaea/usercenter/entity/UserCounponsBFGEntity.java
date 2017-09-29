package com.jx.blackface.gaea.usercenter.entity;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

@GaeaSerializable
@Table(name = "t_user_coupons")
public class UserCounponsBFGEntity {

	@GaeaMember
	@Id(insertable = true)
	@Column(name = "tucid")
	private long tucid;
	@GaeaMember
	@Column(name = "userid")
	private long userid;
	@GaeaMember
	@Column(name = "couponsid")
	private long couponsid;
	@GaeaMember
	@Column(name = "activity")
	private long activity;
	@GaeaMember
	@Column(name = "ecode")
	private long ecode;
	@GaeaMember
	@Column(name = "dqtime")
	private long dqtime;
	@GaeaMember
	@Column(name = "gettime")
	private long gettime;
	@GaeaMember
	@Column(name = "orderid")
	private long orderid;
	@GaeaMember
	@Column(name = "superid")
	private long superid;
	@GaeaMember
	@Column(name = "upordown")
	private int upordown;
	@GaeaMember
	@Column(name = "isuse")
	private int isuse;
	@GaeaMember
	@Column(name = "ctype")
	private int ctype;
	@GaeaMember
	@Column(name = "clabel")
	private long clabel;
	@GaeaMember
	@Column(name = "cmoney")
	private float cmoney;
	@GaeaMember
	@Column(name = "cname")
	private String cname;
	@GaeaMember
	@Column(name = "usetime")
	private long usertime;
	
	
	public long getUsertime() {
		return usertime;
	}
	public void setUsertime(long usertime) {
		this.usertime = usertime;
	}
	
	public float getCmoney() {
		return cmoney;
	}
	public void setCmoney(float cmoney) {
		this.cmoney = cmoney;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getTucid() {
		return tucid;
	}
	public void setTucid(long tucid) {
		this.tucid = tucid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getCouponsid() {
		return couponsid;
	}
	public void setCouponsid(long couponsid) {
		this.couponsid = couponsid;
	}
	public long getEcode() {
		return ecode;
	}
	public void setEcode(long ecode) {
		this.ecode = ecode;
	}
	public long getDqtime() {
		return dqtime;
	}
	public void setDqtime(long dqtime) {
		this.dqtime = dqtime;
	}
	public long getGettime() {
		return gettime;
	}
	public void setGettime(long gettime) {
		this.gettime = gettime;
	}
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public long getSuperid() {
		return superid;
	}
	public void setSuperid(long superid) {
		this.superid = superid;
	}
	public int getUpordown() {
		return upordown;
	}
	public void setUpordown(int upordown) {
		this.upordown = upordown;
	}
	public int getIsuse() {
		return isuse;
	}
	public void setIsuse(int isuse) {
		this.isuse = isuse;
	}
	public int getCtype() {
		return ctype;
	}
	public void setCtype(int ctype) {
		this.ctype = ctype;
	}
	public long getClabel() {
		return clabel;
	}
	public void setClabel(long clabel) {
		this.clabel = clabel;
	}
	public long getActivity() {
		return activity;
	}
	public void setActivity(long activity) {
		this.activity = activity;
	}
	
}
