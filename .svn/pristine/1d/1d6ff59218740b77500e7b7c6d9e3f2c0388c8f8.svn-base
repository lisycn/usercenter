package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;
import com.jx.blackface.gaea.usercenter.entity.CouponsBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;
@ServiceContract
public interface ICouponsService {

	@OperationContract
	public CouponsBFGEntity getCouponsById(long couponsid)throws Exception; 
	@OperationContract
	public List<CouponsBFGEntity> getCoupons(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateCoupons(CouponsBFGEntity e)throws Exception;
	@OperationContract
	public long addCoupons(CouponsBFGEntity e)throws Exception;
	@OperationContract
	public int getCouponsCount(String condition)throws Exception;
	@OperationContract
	public void deleteCoupons(long couponsid)throws Exception;
	@OperationContract
	public int getCouponsStockCount(long couponsid)throws Exception;
}
