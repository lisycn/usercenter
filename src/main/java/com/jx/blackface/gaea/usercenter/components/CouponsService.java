package com.jx.blackface.gaea.usercenter.components;

import java.util.List;

import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ICouponsService;
import com.jx.blackface.gaea.usercenter.entity.CouponsBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
@ServiceBehavior
public class CouponsService extends CommonService implements ICouponsService{
	@Override
	public CouponsBFGEntity getCouponsById(long couponsid) throws Exception {
		return (CouponsBFGEntity)this.getObjectByid(couponsid, CouponsBFGEntity.class);
	}

	@Override
	public List<CouponsBFGEntity> getCoupons(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<CouponsBFGEntity>)this.getListBypage(CouponsBFGEntity.class, condition, pageindex, pagesize, orderby);
	}

	@Override
	public void updateCoupons(CouponsBFGEntity e) throws Exception {
		this.updateObject(e);
	}

	@Override
	public long addCoupons(CouponsBFGEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
			e.setCouponsid(pid);
			insertObjec(e);
			resid = pid;
		}
		return resid;
	}

	@Override
	public int getCouponsCount(String condition) throws Exception {
		return this.getCountBycondition(CouponsBFGEntity.class, condition);
	}

	@Override
	public void deleteCoupons(long couponsid) throws Exception {
		this.deleteObjectByid(CouponsBFGEntity.class, couponsid);
	}

	@Override
	public int getCouponsStockCount(long couponsid) throws Exception {
		CouponsBFGEntity coupons = getCouponsById(couponsid);
		return coupons == null ? -1 : coupons.getCount() - coupons.getUsercount();
	}
}
