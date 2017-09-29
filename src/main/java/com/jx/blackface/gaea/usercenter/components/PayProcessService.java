package com.jx.blackface.gaea.usercenter.components;

import java.util.Date;
import java.util.List;

import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.IPayProcessService;
import com.jx.blackface.gaea.usercenter.entity.PayProcessBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior
public class PayProcessService extends CommonService implements IPayProcessService {

	@Override
	public long addNewPayProcess(PayProcessBFGEntity ppe) throws Exception {
		// TODO Auto-generated method stub
		long rid = 0;
		if(null != ppe){
			long pid = IDHelper.getUniqueID();
			ppe.setPid(pid);
			ppe.setOptime(new Date().getTime());
			insertObjec(ppe);
			rid = pid;
		}
		return rid;
	}

	@Override
	public PayProcessBFGEntity loadPayProcessByid(long ppid) throws Exception {
		// TODO Auto-generated method stub
		return (PayProcessBFGEntity) getObjectByid(ppid, PayProcessBFGEntity.class);
	}

	@Override
	public int getCountByconditon(String condition) throws Exception {
		// TODO Auto-generated method stub
		return getCountBycondition(PayProcessBFGEntity.class,condition);
	}

	@Override
	public List<PayProcessBFGEntity> getPayProcesslistbypage(String condition,
			int pageindex, int pagesize, String sortby) throws Exception {
		// TODO Auto-generated method stub
		return (List<PayProcessBFGEntity>) getListBypage(PayProcessBFGEntity.class,condition,pageindex,pagesize,sortby);
	}

	@Override
	public void updatePayprocess(PayProcessBFGEntity ppe) throws Exception {
		// TODO Auto-generated method stub
		updateObject(ppe);
	}

}
