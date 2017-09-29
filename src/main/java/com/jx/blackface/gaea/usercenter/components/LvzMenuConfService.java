
package com.jx.blackface.gaea.usercenter.components;
import java.util.List;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
import com.jx.blackface.gaea.usercenter.entity.LvzMenuConfEntity;
import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ILvzMenuConfService;

/**
 * @author bruce
 * @date 2016-06-27
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */
@ServiceBehavior 
public class LvzMenuConfService  extends CommonService implements ILvzMenuConfService{
	
	
	public long addLvzMenuConfEntity(LvzMenuConfEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
		    //TODO..  fix id 2 real Idname
			e.setMenu_conf_id(pid);
			//e.setCreatetime(new Date().getTime());
			insertObjec(e);
			resid = pid;
		}
		
		return resid;
	}


	public void updateLvzMenuConfEntity(LvzMenuConfEntity e) throws Exception {
		updateObject(e);
	}

	public LvzMenuConfEntity getLvzMenuConfEntityById(long LvzMenuConfid) throws Exception {
		return (LvzMenuConfEntity)getObjectByid(LvzMenuConfid,LvzMenuConfEntity.class);
	}
	
	public List<LvzMenuConfEntity> getLvzMenuConfEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<LvzMenuConfEntity>) getListBypage(LvzMenuConfEntity.class,
				condition, pageindex, pagesize, orderby);
	}
	
	public int getCount(String condition) throws Exception {
		return this.getCountBycondition(LvzMenuConfEntity.class, condition);
	}


	/* (non-Javadoc)
	 * @see com.jx.blackface.gaea.usercenter.contract.ILvzMenuConfService#delLvzMenuConfEntity(long)
	 */
	public void delLvzMenuConfEntity(long id) throws Exception {
		// TODO Auto-generated method stub
		deleteObjectByid(new LvzMenuConfEntity().getClass(), id);
	}
	

	
}


