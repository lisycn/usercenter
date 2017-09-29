package com.jx.blackface.gaea.usercenter.components;

import java.util.Date;
import java.util.List;

import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.IAccountManagerHisService;
import com.jx.blackface.gaea.usercenter.entity.AccountManagerHisEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
@ServiceBehavior
public class AccountManagerHisService extends CommonService implements IAccountManagerHisService {

	@Override
	public AccountManagerHisEntity getAccountManagerHisEntity(long amid) throws Exception {
		return (AccountManagerHisEntity)getObjectByid(amid,AccountManagerHisEntity.class);
	}

	@Override
	public List<AccountManagerHisEntity> getAccountManagerHisEntity(String condition, int pageindex, int pagesize,
			String orderby) throws Exception {
		return (List<AccountManagerHisEntity>) getListBypage(AccountManagerHisEntity.class, condition, pageindex, pagesize, orderby);
	}

	@Override
	public void updateAccountManagerHisEntity(AccountManagerHisEntity e) throws Exception {
		updateObject(e);
	}

	@Override
	public int getCountAccountManagerHisEntity(String condition) throws Exception {
		return getCountBycondition(AccountManagerHisEntity.class, condition);
	}

	@Override
	public long addAccountManagerHisEntity(AccountManagerHisEntity e) throws Exception {
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
			e.setId(pid);
			e.setAddtime(new Date());
			insertObjec(e);
			resid = pid;
		}
		return resid;
	}

}
