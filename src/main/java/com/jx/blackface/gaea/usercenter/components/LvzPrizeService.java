
package com.jx.blackface.gaea.usercenter.components;
import java.util.List;

import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ILvzPrizeService;
import com.jx.blackface.gaea.usercenter.entity.LvzPrizeEntity;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;

/**
 * @author bruce
 * @date 2016-06-20
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */
@ServiceBehavior 
public class LvzPrizeService  extends CommonService implements ILvzPrizeService{
	
	
	public long addLvzPrizeEntity(LvzPrizeEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
		    //TODO..  fix id 2 real Idname
			e.setPrizeid(pid);
			//e.setCreatetime(new Date().getTime());
			insertObjec(e);
			resid = pid;
		}
		
		return resid;
	}


	public void updateLvzPrizeEntity(LvzPrizeEntity e) throws Exception {
		updateObject(e);
	}

	public LvzPrizeEntity getLvzPrizeEntityById(long LvzPrizeid) throws Exception {
		return (LvzPrizeEntity)getObjectByid(LvzPrizeid,LvzPrizeEntity.class);
	}
	
	public List<LvzPrizeEntity> getLvzPrizeEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<LvzPrizeEntity>) getListBypage(LvzPrizeEntity.class,
				condition, pageindex, pagesize, orderby);
	}
	
	public int getCount(String condition) throws Exception {
		return this.getCountBycondition(LvzPrizeEntity.class, condition);
	}
	

	
}


