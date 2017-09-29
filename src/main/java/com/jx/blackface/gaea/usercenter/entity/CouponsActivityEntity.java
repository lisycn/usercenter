package com.jx.blackface.gaea.usercenter.entity;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

@GaeaSerializable
@Table( name = "t_coupons_activity")
public class CouponsActivityEntity {
	@GaeaMember
	@Id( insertable = true)
	@Column( name = "cactivityid" )
	private long cactivityId;
	
	@GaeaMember
	@Column( name = "activity")
	private String activity;

	public long getCactivityId() {
		return cactivityId;
	}

	public void setCactivityId(long cactivityId) {
		this.cactivityId = cactivityId;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	
}
