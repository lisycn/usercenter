package com.jx.blackface.gaea.usercenter.components;

import java.util.Date;
import java.util.List;

import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.IEmployersService;
import com.jx.blackface.gaea.usercenter.entity.BFEmployersEntity;
@ServiceBehavior
public class EmployersService extends CommonService implements IEmployersService {

	public long addEmployersEntity(BFEmployersEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
			e.setEmpid(pid);
			e.setCreatetime(new Date().getTime());
			insertObjec(e);
			resid = pid;
		}
		
		return resid;
	}


	public void updateEmployersEntity(BFEmployersEntity e) throws Exception {
		updateObject(e);
	}

	public BFEmployersEntity getEmployersEntityById(long Employersid) throws Exception {
		return (BFEmployersEntity)getObjectByid(Employersid,BFEmployersEntity.class);
	}
	public List<BFEmployersEntity> getEmployersEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<BFEmployersEntity>) getListBypage(BFEmployersEntity.class,
				condition, pageindex, pagesize, orderby);
	}

	

	


}
