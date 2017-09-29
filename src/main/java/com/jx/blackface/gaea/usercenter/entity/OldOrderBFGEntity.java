package com.jx.blackface.gaea.usercenter.entity;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

@GaeaSerializable
@Table(name = "t_sorder")
public class OldOrderBFGEntity {

	@GaeaMember
	@Id(insertable = true)
	@Column(name = "orderid")
	private long orderid;
	
	@GaeaMember
	@Column(name = "superid")
	private long superid;
	
	@GaeaMember
	@Column(name = "productid")
	private long productid;
	
	@GaeaMember
	@Column(name = "userid")
	private long userid;
	
	@GaeaMember
	@Column(name = "kefuid")
	private long kefuid;
	
	@GaeaMember
	@Column(name = "empid")
	private long empid;
	
	@GaeaMember
	@Column(name = "fwgwempid")
	private long fwgwempid;
	
	@GaeaMember
	@Column(name = "orderstate")
	private int orderstate;
	
	@GaeaMember
	@Column(name = "paystate")
	private int paystate;
	
	@GaeaMember
	@Column(name = "serverstate")
	private int serverstate;
	
	@GaeaMember
	@Column(name = "signstate")
	private int signstate;
	
	@GaeaMember
	@Column(name = "postime")
	private long postime;
	
	@GaeaMember
	@Column(name = "updatetime")
	private long updatetime;
	
	@GaeaMember
	@Column(name = "description")
	private String description;
	
	@GaeaMember
	@Column(name = "totalmoney")
	private float totalmoney;
	
	@GaeaMember
	@Column(name = "youhje")
	private float youhje;
	@GaeaMember
	@Column(name = "gvreason")
	private String gvreason;
	@GaeaMember
	@Column(name = "ordercity")
	private int ordercity;
	@GaeaMember
	@Column(name = "paycount")
	private float paymoneycount;
	
	//duxf 2015-07-06 start
	@GaeaMember
	@Column(name = "piesingletime")
	private long piesingletime;
	@GaeaMember
	@Column(name = "signtime")
	private long signtime;
	@GaeaMember
	@Column(name = "intentcode")
	private int intentcode;
	@GaeaMember
	@Column(name = "isnewprocess")
	private int isnewprocess;
	//duxf end
	@GaeaMember
	@Column(name = "busid")
	private long busid;
	@GaeaMember
	@Column(name = "prepaidamount")
	private float prepaidamount;
	
	
	public float getPrepaidamount() {
		return prepaidamount;
	}
	public void setPrepaidamount(float prepaidamount) {
		this.prepaidamount = prepaidamount;
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
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getKefuid() {
		return kefuid;
	}
	public void setKefuid(long kefuid) {
		this.kefuid = kefuid;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public long getFwgwempid() {
		return fwgwempid;
	}
	public void setFwgwempid(long fwgwempid) {
		this.fwgwempid = fwgwempid;
	}
	public int getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(int orderstate) {
		this.orderstate = orderstate;
	}
	public int getPaystate() {
		return paystate;
	}
	public void setPaystate(int paystate) {
		this.paystate = paystate;
	}
	public int getServerstate() {
		return serverstate;
	}
	public void setServerstate(int serverstate) {
		this.serverstate = serverstate;
	}
	public int getSignstate() {
		return signstate;
	}
	public void setSignstate(int signstate) {
		this.signstate = signstate;
	}
	public long getPostime() {
		return postime;
	}
	public void setPostime(long postime) {
		this.postime = postime;
	}
	public long getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(long updatetime) {
		this.updatetime = updatetime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(float totalmoney) {
		this.totalmoney = totalmoney;
	}
	public float getYouhje() {
		return youhje;
	}
	public void setYouhje(float youhje) {
		this.youhje = youhje;
	}
	public String getGvreason() {
		return gvreason;
	}
	public void setGvreason(String gvreason) {
		this.gvreason = gvreason;
	}
	public int getOrdercity() {
		return ordercity;
	}
	public void setOrdercity(int ordercity) {
		this.ordercity = ordercity;
	}
	public float getPaymoneycount() {
		return paymoneycount;
	}
	public void setPaymoneycount(float paymoneycount) {
		this.paymoneycount = paymoneycount;
	}
	public long getPiesingletime() {
		return piesingletime;
	}
	public void setPiesingletime(long piesingletime) {
		this.piesingletime = piesingletime;
	}
	public long getSigntime() {
		return signtime;
	}
	public void setSigntime(long signtime) {
		this.signtime = signtime;
	}
	public int getIntentcode() {
		return intentcode;
	}
	public void setIntentcode(int intentcode) {
		this.intentcode = intentcode;
	}
	public int getIsnewprocess() {
		return isnewprocess;
	}
	public void setIsnewprocess(int isnewprocess) {
		this.isnewprocess = isnewprocess;
	}
	public long getBusid() {
		return busid;
	}
	public void setBusid(long busid) {
		this.busid = busid;
	}
	
	
}
