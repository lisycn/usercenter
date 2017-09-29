
package com.jx.blackface.gaea.usercenter.components;
import java.util.List;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
import com.jx.blackface.gaea.usercenter.entity.LvzMenuEntity;
import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ILvzMenuService;

/**
 * @author bruce
 * @date 2016-06-27
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */
@ServiceBehavior 
public class LvzMenuService  extends CommonService implements ILvzMenuService{
	
	
	public long addLvzMenuEntity(LvzMenuEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
		    //TODO..  fix id 2 real Idname
			e.setMenu_id(pid);
			//e.setCreatetime(new Date().getTime());
			insertObjec(e);
			resid = pid;
		}
		
		return resid;
	}


	public void updateLvzMenuEntity(LvzMenuEntity e) throws Exception {
		updateObject(e);
	}
	
	public void delLvzMenuEntity(long id) throws Exception {
		deleteObjectByid(new LvzMenuEntity().getClass(), id);
	}

	public LvzMenuEntity getLvzMenuEntityById(long LvzMenuid) throws Exception {
		return (LvzMenuEntity)getObjectByid(LvzMenuid,LvzMenuEntity.class);
	}
	
	public List<LvzMenuEntity> getLvzMenuEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<LvzMenuEntity>) getListBypage(LvzMenuEntity.class,
				condition, pageindex, pagesize, orderby);
	}
	
	public int getCount(String condition) throws Exception {
		return this.getCountBycondition(LvzMenuEntity.class, condition);
	}
	

	
}


