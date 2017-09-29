package com.jx.blackface.gaea.usercenter.entity;

import java.util.Date;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

@GaeaSerializable
@Table(name = "t_busessparter")
public class BFLoginEntity {

	@GaeaMember
	@Id(insertable = true)
	@Column(name = "userid")
	private long userid;

	@GaeaMember
	@Column(name = "username")
	private String username;
	@GaeaMember
	@Column(name = "password")
	private String password;
	@GaeaMember
	@Column(name = "openid")
	private String openid;
	@GaeaMember
	@Column(name = "userphone")
	private String userphone;
	@GaeaMember
	@Column(name = "email")
	private String email;
	@GaeaMember
	@Column(name = "sidnumbers")
	private String sidnumbers;
	@GaeaMember
	@Column(name = "cityid")
	private int cityid;
	@GaeaMember
	@Column(name = "address")
	private String address;
	@GaeaMember
	@Column(name = "regtime")
	private Date regtime;
	@GaeaMember
	@Column(name = "regip")
	private String regip;
	@GaeaMember
	@Column(name = "userstate")
	private int userstate;
	@GaeaMember
	@Column(name = "lastuptime")
	private Date lastuptime;
	@GaeaMember
	@Column(name = "citystr")
	private String citystr;
	@GaeaMember
	@Column(name = "addtime")
	private Long addtime;
	@GaeaMember
	@Column(name = "channel")
	private int channel;
	@GaeaMember
	@Column(name = "companyname")
	private String companyname;
	@GaeaMember
	@Column(name = "landlinenumber")
	private String landlinenumber;

	@GaeaMember
	@Column(name = "authenflag")
	private int authenflag;
	@GaeaMember
	@Column(name = "areaid")
	private long areaid;
	
	@GaeaMember
	@Column(name = "att_data_id")
	private long att_data_id;
	
	

	public long getAreaid() {
		return areaid;
	}

	public void setAreaid(long areaid) {
		this.areaid = areaid;
	}

	public String getLandlinenumber() {
		return landlinenumber;
	}

	public void setLandlinenumber(String landlinenumber) {
		this.landlinenumber = landlinenumber;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSidnumbers() {
		return sidnumbers;
	}

	public void setSidnumbers(String sidnumbers) {
		this.sidnumbers = sidnumbers;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegtime() {
		return regtime;
	}

	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	public String getRegip() {
		return regip;
	}

	public void setRegip(String regip) {
		this.regip = regip;
	}

	public int getUserstate() {
		return userstate;
	}

	public void setUserstate(int userstate) {
		this.userstate = userstate;
	}

	public Date getLastuptime() {
		return lastuptime;
	}

	public void setLastuptime(Date lastuptime) {
		this.lastuptime = lastuptime;
	}

	public String getCitystr() {
		return citystr;
	}

	public void setCitystr(String citystr) {
		this.citystr = citystr;
	}

	public Long getAddtime() {
		return addtime;
	}

	public void setAddtime(Long addtime) {
		this.addtime = addtime;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getAuthenflag() {
		return authenflag;
	}

	public void setAuthenflag(int authenflag) {
		this.authenflag = authenflag;
	}

	public long getAtt_data_id() {
		return att_data_id;
	}

	public void setAtt_data_id(long att_data_id) {
		this.att_data_id = att_data_id;
	}

	
}
