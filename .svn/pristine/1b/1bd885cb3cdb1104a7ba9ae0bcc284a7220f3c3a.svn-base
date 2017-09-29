package com.jx.blackface.gaea.usercenter.components;

import java.util.Date;
import java.util.List;

import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.IPayRecordService;
import com.jx.blackface.gaea.usercenter.entity.PayRecordBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior
public class PayRecordService extends CommonService implements IPayRecordService {

	@Override
	public long addNewPayrecord(PayRecordBFGEntity pre) throws Exception {
		// TODO Auto-generated method stub
		long pid = 0;
		if(null != pre){
			long nid = IDHelper.getUniqueID();
			pre.setPayid(nid);
			pre.setReqtime(new Date().getTime());
			insertObjec(pre);
			pid = nid;
		}
		return pid;
	}

	@Override
	public PayRecordBFGEntity loadPayRecordByid(long payid) throws Exception {
		// TODO Auto-generated method stub
		return (PayRecordBFGEntity) getObjectByid(payid,PayRecordBFGEntity.class);
	}

	@Override
	public int getPayRecordBycondition(String condition) throws Exception {
		// TODO Auto-generated method stub
		return getCountBycondition(PayRecordBFGEntity.class,condition);
	}

	@Override
	public List<PayRecordBFGEntity> getPayRecordListbypage(String condition,
			int pageindex, int pagesize, String sortby) throws Exception {
		// TODO Auto-generated method stub
		return (List<PayRecordBFGEntity>) getListBypage(PayRecordBFGEntity.class,condition,pageindex,pagesize,sortby);
	}

	@Override
	public void updatePayRecord(PayRecordBFGEntity pre) throws Exception {
		// TODO Auto-generated method stub
		updateObject(pre);
	}

}
