package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.PayProcessBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface IPayProcessService {

	@OperationContract
	public long addNewPayProcess(PayProcessBFGEntity ppe)throws Exception;
	@OperationContract
	public PayProcessBFGEntity loadPayProcessByid(long ppid)throws Exception;
	@OperationContract
	public int getCountByconditon(String condition)throws Exception;
	@OperationContract
	public List<PayProcessBFGEntity> getPayProcesslistbypage(String condition,int pageindex,
			int pagesize,String sortby)throws Exception;
	@OperationContract
	public void updatePayprocess(PayProcessBFGEntity ppe)throws Exception;
}
