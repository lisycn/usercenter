package com.jx.blackface.gaea.usercenter.components;

import java.util.Date;
import java.util.List;

import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.IAccountManagerService;
import com.jx.blackface.gaea.usercenter.entity.AccountManagerEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
@ServiceBehavior
public class AccountManagerService extends CommonService implements IAccountManagerService {

	@Override
	public AccountManagerEntity getAccountManagerEntity(long amid) throws Exception {
		return (AccountManagerEntity)getObjectByid(amid,AccountManagerEntity.class);
	}

	@Override
	public List<AccountManagerEntity> getAccountManagerEntityList(String condition, int pageindex, int pagesize,
			String orderby) throws Exception {
		return (List<AccountManagerEntity>) getListBypage(AccountManagerEntity.class, condition, pageindex, pagesize, orderby);
	}

	@Override
	public void updateAccountManagerEntity(AccountManagerEntity e) throws Exception {
		e.setUpdatetime(new Date());
		updateObject(e);
	}

	@Override
	public int getCountAccountManagerEntity(String condition) throws Exception {
		return getCountBycondition(AccountManagerEntity.class, condition);
	}

	@Override
	public long addAccountManagerEntity(AccountManagerEntity e) throws Exception {
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
			e.setAmid(pid);
			e.setAddtime(new Date());
			insertObjec(e);
			resid = pid;
		}
		return resid;
	}

	@Override
	public AccountManagerEntity getAccountManagerEntityByUserId(long userid) throws Exception {
		if(userid <= 0){
			return null;
		}
		String condition = " userid='"+userid+"' ";
		List<AccountManagerEntity> accountManagerEntityList = getAccountManagerEntityList(condition, 1, 1, null);
		if(null == accountManagerEntityList || accountManagerEntityList.isEmpty()){
			return null;
		}
		return accountManagerEntityList.get(0);
	}

}
