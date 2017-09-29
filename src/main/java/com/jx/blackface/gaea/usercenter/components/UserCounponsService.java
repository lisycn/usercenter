package com.jx.blackface.gaea.usercenter.components;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.IUserCounponsService;
import com.jx.blackface.gaea.usercenter.entity.UserCounponsBFGEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior
public class UserCounponsService extends CommonService implements
		IUserCounponsService {

	@Override
	public UserCounponsBFGEntity getUsercounponsById(long ucid)
			throws Exception {
		// TODO Auto-generated method stub
		return (UserCounponsBFGEntity) getObjectByid(ucid,UserCounponsBFGEntity.class);
	}

	@Override
	public long addUcounps(UserCounponsBFGEntity uce) throws Exception {
		// TODO Auto-generated method stub
		long rid = 0;
		if(uce != null){
			long pid = IDHelper.getUniqueID();
			uce.setTucid(pid);
			uce.setGettime(new Date().getTime());
			insertObjec(uce);
			rid = pid;
		}
		return rid;
	}

	@Override
	public int getUcounponsCountbycondition(String condition) throws Exception {
		// TODO Auto-generated method stub
		return getCountBycondition(UserCounponsBFGEntity.class,condition);
	}

	@Override
	public List<UserCounponsBFGEntity> getUcounponsBypage(String codontition,
			int pageindex, int pagesize, String orderby) throws Exception {
		// TODO Auto-generated method stub
		return (List<UserCounponsBFGEntity>) getListBypage(UserCounponsBFGEntity.class,codontition,pageindex,pagesize,orderby);
	}

	@Override
	public void updateUcounpons(UserCounponsBFGEntity uc) throws Exception {
		// TODO Auto-generated method stub
		updateObject(uc);
	}

	@Override
	public List<UserCounponsBFGEntity> getUcounponsInUserBypage(long userid, long activityid, int pageindex, int pagesize, String orderby) throws Exception {
		return getUcounponsBypage(" userid = "+userid + " and activity = " + activityid, pageindex, pagesize, StringUtils.isEmpty(orderby) ? "gettime desc" : orderby);
	}

	@Override
	public long getUcouponsInTime(long ucid, String condition) throws Exception {
		return getUcounponsCountbycondition(" couponsid = " + ucid + " and " + condition);
	}

	@Override
	public List<UserCounponsBFGEntity> getUcouponsInActivityByPage(long activityid, int pageindex, int pagesize, String orderby) throws Exception {
		return getUcounponsBypage(" activity = " + activityid, pageindex, pagesize, StringUtils.isEmpty(orderby) ? "gettime desc" : orderby);
	}

	@Override
	public int getUsercounponsByUserid(long userid,long activityid) throws Exception {
		return getCountBycondition(UserCounponsBFGEntity.class, "userid = "+ userid +" and activity = " + activityid);
	}

}
