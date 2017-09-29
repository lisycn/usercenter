package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.AccountManagerHisEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface IAccountManagerHisService {

	@OperationContract
	public long addAccountManagerHisEntity(AccountManagerHisEntity e)throws Exception;
	@OperationContract
	public AccountManagerHisEntity getAccountManagerHisEntity(long amid)throws Exception; 
	@OperationContract
	public List<AccountManagerHisEntity> getAccountManagerHisEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateAccountManagerHisEntity(AccountManagerHisEntity e)throws Exception;
	
	@OperationContract
	public int getCountAccountManagerHisEntity(String condition) throws Exception;
}
