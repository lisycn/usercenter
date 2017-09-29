package com.jx.blackface.gaea.usercenter.entity;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

@GaeaSerializable
@Table(name = "t_areas")
public class BFAreasEntity {

	@GaeaMember
	@Id(insertable = true)
	@Column(name = "areaid")
	private Integer areaid;

	@GaeaMember
	@Column(name = "name")
	private String name;
	@GaeaMember
	@Column(name = "joinname")
	private String joinname;
	@GaeaMember
	@Column(name = "parentid")
	private String parentid;
	@GaeaMember
	@Column(name = "vieworder")
	private String vieworder;
	@GaeaMember
	@Column(name = "status")
	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getAreaid() {
		return areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoinname() {
		return joinname;
	}

	public void setJoinname(String joinname) {
		this.joinname = joinname;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getVieworder() {
		return vieworder;
	}

	public void setVieworder(String vieworder) {
		this.vieworder = vieworder;
	}

}
