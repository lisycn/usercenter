package com.jx.blackface.gaea.usercenter.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ILoginService;
import com.jx.blackface.gaea.usercenter.entity.BFLoginEntity;
import com.jx.blackface.gaea.usercenter.entity.TBusessparterExtEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior
public class LoginService extends CommonService implements ILoginService {

	public long addLoginEntity(BFLoginEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		
		if(e != null){
			List<BFLoginEntity> lis = (List<BFLoginEntity>) getListBypage(BFLoginEntity.class,"userphone='"+e.getUserphone()+"'",1,1,"addtime");
			if(null != lis && lis.size() > 0){
				resid = lis.get(0).getUserid();
			}else{
				long pid = IDHelper.getUniqueID();
				e.setUserid(pid);
				e.setAddtime(new Date().getTime());
				insertObjec(e);
				resid = pid;
			}
			
		}
		
		return resid;
	}


	public void updateLoginEntity(BFLoginEntity e) throws Exception {
		e.setLastuptime(new Date());
		updateObject(e);
	}

	public BFLoginEntity getLoginEntityById(long loginid) throws Exception {
		return (BFLoginEntity)getObjectByid(loginid,BFLoginEntity.class);
	}
	public List<BFLoginEntity> getLoginEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		System.out.println("condition--has been sealized--"+condition);
		return (List<BFLoginEntity>) getListBypage(BFLoginEntity.class, condition, pageindex, pagesize, orderby);
	}


	/* (non-Javadoc)
	 * @see com.jx.blackface.gaea.usercenter.contract.ILoginService#getCount(java.lang.String)
	 */
	@Override
	public int getCount(String condition) throws Exception {
		// TODO Auto-generated method stub
		return this.getCountBycondition(BFLoginEntity.class, condition);
	}

	@Override
	public long addTBusessparterExtEntity(TBusessparterExtEntity se) throws Exception {
		long res = 0;
		long pid = IDHelper.getUniqueID();
		if(se != null){
			se.setId(pid);
			se.setCreateDate(new Date());
			insertObjec(se);
			res = pid;
		}
		
		return res;
	}
	@Override
	public void updateTBusessparterExtEntity(TBusessparterExtEntity tBusessparterExtEntity) throws Exception {
		tBusessparterExtEntity.setModifyDate(new Date());
		this.updateObject(tBusessparterExtEntity);
	}
	
	@Override
	public void deleteTBusessparterExtEntity(long seId) throws Exception {
		this.deleteObjectByid(TBusessparterExtEntity.class, seId);
	}
	
	@Override
	public void deleteTBusessparterExtEntityByUserId(long seId) throws Exception {
		List<TBusessparterExtEntity> lst = getTBusessparterExtEntityByUserId(String.valueOf(seId));
		for(int i = 0;i<lst.size();i++){
			this.deleteTBusessparterExtEntity(lst.get(i).getId());
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<TBusessparterExtEntity> getTBusessparterExtEntityByUserId(String userId) throws Exception {
		List<TBusessparterExtEntity> rs = new ArrayList<TBusessparterExtEntity>();
		String sql = "select * from t_busessparter_ext where userId = ?";
		String[] param = {userId};
		List r = this.getListBySQL(TBusessparterExtEntity.class, sql, param);
		if(r != null){
			for(Object e:r){
				rs.add((TBusessparterExtEntity) e);
			}
		}
		return rs;
	}


	@Override
	public List<TBusessparterExtEntity> getTBusessparterExtEntityList(String condition, int pageindex, int pagesize,
			String orderby) throws Exception {
		return (List<TBusessparterExtEntity>) getListBypage(TBusessparterExtEntity.class, condition, pageindex, pagesize, orderby);
	}
	

}
