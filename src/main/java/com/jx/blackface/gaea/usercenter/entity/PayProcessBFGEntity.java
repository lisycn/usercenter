package com.jx.blackface.gaea.usercenter.entity;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

@GaeaSerializable
@Table(name = "t_pay_process")
public class PayProcessBFGEntity {
	@GaeaMember
	@Id(insertable = true)
	@Column(name = "pid")
	private long pid;
	@GaeaMember
	@Column(name = "paystate")
	private int paystate;
	@GaeaMember
	@Column(name = "optime")
	private long optime;
	@GaeaMember
	@Column(name = "opempid")
	private long opempid;
	@GaeaMember
	@Column(name = "optype")
	private int optype;
	@GaeaMember
	@Column(name = "orderstate")
	private int orderstate;
	@GaeaMember
	@Column(name = "paychannel")
	private int paychannel;
	@GaeaMember
	@Column(name = "contents")
	private String contents;
	@GaeaMember
	@Column(name = "paynumber")
	private float paynumber;
	@GaeaMember
	@Column(name = "orderid")
	private long orderid;
	@GaeaMember
	@Column(name = "payfee")
	private float payfee;
	@GaeaMember
	@Column(name = "paytotal")
	private float paytotal;
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public int getPaystate() {
		return paystate;
	}
	public void setPaystate(int paystate) {
		this.paystate = paystate;
	}
	public long getOptime() {
		return optime;
	}
	public void setOptime(long optime) {
		this.optime = optime;
	}
	public long getOpempid() {
		return opempid;
	}
	public void setOpempid(long opempid) {
		this.opempid = opempid;
	}
	public int getOptype() {
		return optype;
	}
	public void setOptype(int optype) {
		this.optype = optype;
	}
	public int getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(int orderstate) {
		this.orderstate = orderstate;
	}
	public int getPaychannel() {
		return paychannel;
	}
	public void setPaychannel(int paychannel) {
		this.paychannel = paychannel;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public float getPaynumber() {
		return paynumber;
	}
	public void setPaynumber(float paynumber) {
		this.paynumber = paynumber;
	}
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public float getPayfee() {
		return payfee;
	}
	public void setPayfee(float payfee) {
		this.payfee = payfee;
	}
	public float getPaytotal() {
		return paytotal;
	}
	public void setPaytotal(float paytotal) {
		this.paytotal = paytotal;
	}
	
	
}
