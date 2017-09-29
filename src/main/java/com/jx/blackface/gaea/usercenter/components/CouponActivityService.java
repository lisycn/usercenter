package com.jx.blackface.gaea.usercenter.components;

import com.jx.blackface.gaea.usercenter.contract.ICouponActivityService;
import com.jx.blackface.gaea.usercenter.entity.CouponsActivityEntity;

public class CouponActivityService extends CommonService implements ICouponActivityService{

	@Override
	public String getActivity(long activityid) throws Exception {
		CouponsActivityEntity entity = (CouponsActivityEntity) super.getObjectByid(activityid, CouponsActivityEntity.class);
		return entity == null ? "" : entity.getActivity();
	}

}
