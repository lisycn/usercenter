package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.CouponsStrategyEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface ICouponsStarategyService {
	
	@OperationContract
	public List<CouponsStrategyEntity> getCouponsStarategyEntityList(String condition,int pageIndex,int pageSize,String orderby) throws Exception;
	
	@OperationContract
	public long addCouponsStarategyEntity(CouponsStrategyEntity entity)throws Exception;
	
	@OperationContract
	public void updateCouponsStaragegyEntity(CouponsStrategyEntity entity) throws Exception;
	
	@OperationContract
	public int getCouponStaragegyCount(String condition) throws Exception;

}
