package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.AccountManagerEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface IAccountManagerService {
	@OperationContract
	public long addAccountManagerEntity(AccountManagerEntity e)throws Exception;
	@OperationContract
	public AccountManagerEntity getAccountManagerEntity(long amid)throws Exception; 
	@OperationContract
	public List<AccountManagerEntity> getAccountManagerEntityList(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateAccountManagerEntity(AccountManagerEntity e)throws Exception;
	
	@OperationContract
	public int getCountAccountManagerEntity(String condition) throws Exception;
	
	@OperationContract
	public AccountManagerEntity getAccountManagerEntityByUserId(long userid) throws Exception;
}
