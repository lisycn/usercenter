package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.BFEmployersEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface IEmployersService {
	
	@OperationContract
	public long addEmployersEntity(BFEmployersEntity e)throws Exception;
	@OperationContract
	public BFEmployersEntity getEmployersEntityById(long Employersid)throws Exception; 
	@OperationContract
	public List<BFEmployersEntity> getEmployersEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateEmployersEntity(BFEmployersEntity e)throws Exception;
}
