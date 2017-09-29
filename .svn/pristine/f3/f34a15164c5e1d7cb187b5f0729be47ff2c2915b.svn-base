package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.BFAreasEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface IAreasService {

	@OperationContract
	public BFAreasEntity getAeasEntityById(long Aeasid)throws Exception; 
	@OperationContract
	public List<BFAreasEntity> getAeasEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateAeasEntity(BFAreasEntity e)throws Exception;
	
	@OperationContract
	public int getCountAreaEntity(String condition) throws Exception;
}
