package com.jx.blackface.gaea.usercenter.entity;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

/**
 * @author bruce
 * @date 2016-06-20
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */

@GaeaSerializable
@Table(name = "t_lvz_prize")
public class LvzPrizeEntity {

@GaeaMember
@Id(insertable = true)
@Column(name = "prizeid")
private long prizeid;

@GaeaMember
@Column(name = "prizeno")
private Integer prizeno;

@GaeaMember
@Column(name = "descp")
private String descp;

@GaeaMember
@Column(name = "type")
private Integer type;

@GaeaMember
@Column(name = "exchangeno")
private String exchangeno;

@GaeaMember
@Column(name = "password")
private String password;

@GaeaMember
@Column(name = "status")
private Integer status;



	
	public long getPrizeid() {
	return prizeid;	
}
	
public void setPrizeid(long prizeid) {
	this.prizeid = prizeid;
}
		
	
	public Integer getPrizeno() {
	return prizeno;	
}
	
public void setPrizeno(Integer prizeno) {
	this.prizeno = prizeno;
}	
		
	
	public String getDescp() {
	return descp;	
}
	
public void setDescp(String descp) {
	this.descp = descp;
}	
		
	
	public Integer getType() {
	return type;	
}
	
public void setType(Integer type) {
	this.type = type;
}	
		
	
	public String getExchangeno() {
	return exchangeno;	
}
	
public void setExchangeno(String exchangeno) {
	this.exchangeno = exchangeno;
}	
		
	
	public String getPassword() {
	return password;	
}
	
public void setPassword(String password) {
	this.password = password;
}	
		
	
	public Integer getStatus() {
	return status;	
}
	
public void setStatus(Integer status) {
	this.status = status;
}	
		

}