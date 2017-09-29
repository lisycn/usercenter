package com.jx.blackface.gaea.usercenter.components;

import java.util.Date;

import com.jx.blackface.gaea.usercenter.contract.IOldOrderBFGService;
import com.jx.blackface.gaea.usercenter.entity.OldOrderBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior
public class OldOrderBFGService extends CommonService implements IOldOrderBFGService {

	@Override
	public void updateOrder(OldOrderBFGEntity bfe) throws Exception {
		// TODO Auto-generated method stub
		if(bfe != null){
			bfe.setUpdatetime(new Date().getTime());
			updateObject(bfe);
		}
		
	}

	@Override
	public OldOrderBFGEntity loadOrderbyid(long orderid) throws Exception {
		// TODO Auto-generated method stub
		return (OldOrderBFGEntity) getObjectByid(orderid,OldOrderBFGEntity.class);
	}

}
