package com.jx.blackface.gaea.usercenter.contract;

import com.jx.blackface.gaea.usercenter.entity.OldOrderBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface IOldOrderBFGService {
	@OperationContract
	public void updateOrder(OldOrderBFGEntity bfe)throws Exception;
	@OperationContract
	public OldOrderBFGEntity loadOrderbyid(long orderid)throws Exception;
}
