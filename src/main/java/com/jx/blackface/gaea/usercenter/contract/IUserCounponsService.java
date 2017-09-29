package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.UserCounponsBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface IUserCounponsService {

	@OperationContract
	public UserCounponsBFGEntity getUsercounponsById(long ucid)throws Exception;
	@OperationContract
	public long addUcounps(UserCounponsBFGEntity uce)throws Exception;
	@OperationContract
	public int getUcounponsCountbycondition(String condition)throws Exception;
	@OperationContract
	public List<UserCounponsBFGEntity> getUcounponsBypage(String codontition,int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateUcounpons(UserCounponsBFGEntity uc)throws Exception;
	@OperationContract
	public List<UserCounponsBFGEntity> getUcounponsInUserBypage(long userid, long activityid, int pageindex,int pagesize,String orderby) throws Exception;
	@OperationContract
	public long getUcouponsInTime(long ucid, String condition) throws Exception;
	@OperationContract
	public List<UserCounponsBFGEntity> getUcouponsInActivityByPage(long activityid, int pageindex, int pagesize, String orderby)throws Exception;
	@OperationContract
	public int getUsercounponsByUserid(long userid, long activityid) throws Exception;
}
