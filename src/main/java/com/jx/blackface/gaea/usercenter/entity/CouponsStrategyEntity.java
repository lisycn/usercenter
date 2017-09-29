package com.jx.blackface.gaea.usercenter.entity;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

@GaeaSerializable
@Table(name = "t_coupons_strategy")
public class CouponsStrategyEntity {
	@GaeaMember
	@Id(insertable = true)
	@Column(name = "strategid")
	private long strategid;
	
	@GaeaMember
	@Column(name = "strategcode")
	private long strategcode;
	
	@GaeaMember
	@Column(name = "couponjson")
	private String couponjson;
	
	@GaeaMember
	@Column(name = "ismsg")
	private int ismsg;
	
	@GaeaMember
	@Column(name = "msgmodelid")
	private long msgmodelid;
	
	@GaeaMember
	@Column(name = "msgcontent")
	private String msgcontent;
	
	@GaeaMember
	@Column(name = "ismodel")
	private int ismodel;
	
	@GaeaMember
	@Column(name = "modelcontent")
	private String modelcontent;
	
	@GaeaMember
	@Column(name = "isemail")
	private int isemail;
	
	@GaeaMember
	@Column(name = "emailcontent")
	private String emailcontent;
	
	@GaeaMember
	@Column(name = "isuse")
	private int isuse;

	public long getStrategid() {
		return strategid;
	}

	public void setStrategid(long strategid) {
		this.strategid = strategid;
	}

	public long getStrategcode() {
		return strategcode;
	}

	public void setStrategcode(long strategcode) {
		this.strategcode = strategcode;
	}

	public String getCouponjson() {
		return couponjson;
	}

	public void setCouponjson(String couponjson) {
		this.couponjson = couponjson;
	}

	public int getIsmsg() {
		return ismsg;
	}

	public void setIsmsg(int ismsg) {
		this.ismsg = ismsg;
	}

	public long getMsgmodelid() {
		return msgmodelid;
	}

	public void setMsgmodelid(long msgmodelid) {
		this.msgmodelid = msgmodelid;
	}

	public String getMsgcontent() {
		return msgcontent;
	}

	public void setMsgcontent(String msgcontent) {
		this.msgcontent = msgcontent;
	}

	public int getIsmodel() {
		return ismodel;
	}

	public void setIsmodel(int ismodel) {
		this.ismodel = ismodel;
	}

	public String getModelcontent() {
		return modelcontent;
	}

	public void setModelcontent(String modelcontent) {
		this.modelcontent = modelcontent;
	}

	public int getIsemail() {
		return isemail;
	}

	public void setIsemail(int isemail) {
		this.isemail = isemail;
	}

	public String getEmailcontent() {
		return emailcontent;
	}

	public void setEmailcontent(String emailcontent) {
		this.emailcontent = emailcontent;
	}

	public int getIsuse() {
		return isuse;
	}

	public void setIsuse(int isuse) {
		this.isuse = isuse;
	}
	
	
}
