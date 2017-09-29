
package com.jx.blackface.gaea.usercenter.components;
import java.util.List;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
import com.jx.blackface.gaea.usercenter.entity.LvzAddressAreaorderEntity;
import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ILvzAddressAreaorderService;

/**
 * @author bruce
 * @date 2016-08-23
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */
@ServiceBehavior 
public class LvzAddressAreaorderService  extends CommonService implements ILvzAddressAreaorderService{
	
	
	public long addLvzAddressAreaorderEntity(LvzAddressAreaorderEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
		    //TODO..  fix id 2 real Idname
			e.setAreaorder_id(pid);
			//e.setCreatetime(new Date().getTime());
			insertObjec(e);
			resid = pid;
		}
		
		return resid;
	}


	public void updateLvzAddressAreaorderEntity(LvzAddressAreaorderEntity e) throws Exception {
		updateObject(e);
	}

	public LvzAddressAreaorderEntity getLvzAddressAreaorderEntityById(long LvzAddressAreaorderid) throws Exception {
		return (LvzAddressAreaorderEntity)getObjectByid(LvzAddressAreaorderid,LvzAddressAreaorderEntity.class);
	}
	
	public List<LvzAddressAreaorderEntity> getLvzAddressAreaorderEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<LvzAddressAreaorderEntity>) getListBypage(LvzAddressAreaorderEntity.class,
				condition, pageindex, pagesize, orderby);
	}
	
	public int getCount(String condition) throws Exception {
		return this.getCountBycondition(LvzAddressAreaorderEntity.class, condition);
	}
	

	
}


