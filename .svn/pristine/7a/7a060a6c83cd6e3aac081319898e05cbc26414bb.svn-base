
package com.jx.blackface.gaea.usercenter.components;
import java.util.List;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
import com.jx.blackface.gaea.usercenter.entity.LvzProductConfEntity;
import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ILvzProductConfService;

/**
 * @author bruce
 * @date 2016-06-27
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */
@ServiceBehavior 
public class LvzProductConfService  extends CommonService implements ILvzProductConfService{
	
	
	public long addLvzProductConfEntity(LvzProductConfEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
		    //TODO..  fix id 2 real Idname
			e.setProduct_conf_id(pid);
			//e.setCreatetime(new Date().getTime());
			insertObjec(e);
			resid = pid;
		}
		
		return resid;
	}


	public void updateLvzProductConfEntity(LvzProductConfEntity e) throws Exception {
		updateObject(e);
	}

	public LvzProductConfEntity getLvzProductConfEntityById(long LvzProductConfid) throws Exception {
		return (LvzProductConfEntity)getObjectByid(LvzProductConfid,LvzProductConfEntity.class);
	}
	
	public List<LvzProductConfEntity> getLvzProductConfEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<LvzProductConfEntity>) getListBypage(LvzProductConfEntity.class,
				condition, pageindex, pagesize, orderby);
	}
	
	public int getCount(String condition) throws Exception {
		return this.getCountBycondition(LvzProductConfEntity.class, condition);
	}


	/* (non-Javadoc)
	 * @see com.jx.blackface.gaea.usercenter.contract.ILvzProductConfService#delLvzProductConfEntity(long)
	 */
	public void delLvzProductConfEntity(long id) throws Exception {
		// TODO Auto-generated method stub
		deleteObjectByid(new LvzProductConfEntity().getClass(), id);
	}
	

	
}


