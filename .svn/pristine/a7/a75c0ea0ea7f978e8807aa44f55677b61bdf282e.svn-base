package com.jx.blackface.gaea.usercenter.components;

import java.util.List;
import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ICouponsStarategyService;
import com.jx.blackface.gaea.usercenter.entity.CouponsStrategyEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior
public class CouponsStarategyService extends CommonService implements ICouponsStarategyService{

	@Override
	public List<CouponsStrategyEntity> getCouponsStarategyEntityList(String condition, int pageIndex, int pageSize,
			String orderby) throws Exception {
		return (List<CouponsStrategyEntity>)this.getListBypage(CouponsStrategyEntity.class, condition, pageIndex, pageSize, orderby);
	}

	@Override
	public long addCouponsStarategyEntity(CouponsStrategyEntity entity) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long strategid = IDHelper.getUniqueID();
		if(entity != null){
			entity.setStrategid(strategid);
			insertObjec(entity);
			resid = strategid;
		}
		return resid;
	}

	@Override
	public void updateCouponsStaragegyEntity(CouponsStrategyEntity entity) throws Exception {
		this.updateObject(entity);
	}

	@Override
	public int getCouponStaragegyCount(String condition) throws Exception {
		return this.getCountBycondition(CouponsStrategyEntity.class, condition);
	}

//	@Override
//	public CouponsStrategyEntity getCouponsStarategyEntityByStarategyCode(String starategyCode) throws Exception {
//		if(StringUtils.isBlank(starategyCode)){
//			return null;
//		}
//		List<CouponsStrategyEntity> couponsStarategyEntityList = this.getCouponsStarategyEntityList("", 1, 1, null);
//		if(null == couponsStarategyEntityList || couponsStarategyEntityList.isEmpty()){
//			return null;
//		}
//		return couponsStarategyEntityList.get(0);
//	}

}
