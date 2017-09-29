package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.BFLoginEntity;
import com.jx.blackface.gaea.usercenter.entity.TBusessparterExtEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface ILoginService {

	@OperationContract
	public long addLoginEntity(BFLoginEntity e)throws Exception;
	@OperationContract
	public BFLoginEntity getLoginEntityById(long loginid)throws Exception; 
	@OperationContract
	public List<BFLoginEntity> getLoginEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateLoginEntity(BFLoginEntity e)throws Exception;
	
	@OperationContract
	public int getCount(String condition)throws Exception;
	
	@OperationContract
	public long addTBusessparterExtEntity(TBusessparterExtEntity se)throws Exception;
	@OperationContract
	public void updateTBusessparterExtEntity(TBusessparterExtEntity tBusessparterExtEntity) throws Exception;
	@OperationContract
	public void deleteTBusessparterExtEntity(long seId) throws Exception;
	@OperationContract
	public List<TBusessparterExtEntity> getTBusessparterExtEntityByUserId(String userId) throws Exception;
	@OperationContract
	public void deleteTBusessparterExtEntityByUserId(long seId) throws Exception;
	@OperationContract
	public List<TBusessparterExtEntity> getTBusessparterExtEntityList(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
}
