
package com.jx.blackface.gaea.usercenter.components;
import java.util.List;

import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ILvzAddressConfService;
import com.jx.blackface.gaea.usercenter.entity.LvzAddressConfEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;

/**
 * @author bruce
 * @date 2016-08-23
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */
@ServiceBehavior 
public class LvzAddressConfService  extends CommonService implements ILvzAddressConfService{
	
	
	public long addLvzAddressConfEntity(LvzAddressConfEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
		    //TODO..  fix id 2 real Idname
			e.setAddress_conf_id(pid);
			//e.setCreatetime(new Date().getTime());
			insertObjec(e);
			resid = pid;
		}
		
		return resid;
	}


	public void updateLvzAddressConfEntity(LvzAddressConfEntity e) throws Exception {
		updateObject(e);
	}

	public LvzAddressConfEntity getLvzAddressConfEntityById(long LvzAddressConfid) throws Exception {
		return (LvzAddressConfEntity)getObjectByid(LvzAddressConfid,LvzAddressConfEntity.class);
	}
	
	public List<LvzAddressConfEntity> getLvzAddressConfEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<LvzAddressConfEntity>) getListBypage(LvzAddressConfEntity.class,
				condition, pageindex, pagesize, orderby);
	}
	
	public int getCount(String condition) throws Exception {
		return this.getCountBycondition(LvzAddressConfEntity.class, condition);
	}


	/* (non-Javadoc)
	 * @see com.jx.blackface.gaea.usercenter.contract.ILvzAddressConfService#delLvzAddressConfEntity(long)
	 */
	@Override
	public void delLvzAddressConfEntity(long id) throws Exception {
		// TODO Auto-generated method stub
		deleteObjectByid(new LvzAddressConfEntity().getClass(), id);
	}
	

	
}


