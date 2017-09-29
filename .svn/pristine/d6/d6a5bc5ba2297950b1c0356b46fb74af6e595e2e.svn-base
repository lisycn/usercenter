package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.PayRecordBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface IPayRecordService {
	@OperationContract
	public long addNewPayrecord(PayRecordBFGEntity pre)throws Exception;
	@OperationContract
	public PayRecordBFGEntity loadPayRecordByid(long payid)throws Exception;
	@OperationContract
	public int getPayRecordBycondition(String condition)throws Exception;
	@OperationContract
	public List<PayRecordBFGEntity> getPayRecordListbypage(String condition,int pageindex,
			int pagesize,String sortby)throws Exception;
	@OperationContract
	public void updatePayRecord(PayRecordBFGEntity pre)throws Exception;
}
