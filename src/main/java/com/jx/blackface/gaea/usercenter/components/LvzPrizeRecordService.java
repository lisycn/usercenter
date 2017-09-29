
package com.jx.blackface.gaea.usercenter.components;
import java.util.List;
import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
import com.jx.blackface.gaea.usercenter.entity.LvzPrizeRecordEntity;
import com.jx.blackface.gaea.usercenter.common.IDHelper;
import com.jx.blackface.gaea.usercenter.contract.ILvzPrizeRecordService;

/**
 * @author bruce
 * @date 2016-06-20
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */
@ServiceBehavior 
public class LvzPrizeRecordService  extends CommonService implements ILvzPrizeRecordService{
	
	
	public long addLvzPrizeRecordEntity(LvzPrizeRecordEntity e) throws Exception {
		// TODO Auto-generated method stub
		long resid = 0;
		long pid = IDHelper.getUniqueID();
		if(e != null){
		    //TODO..  fix id 2 real Idname
			e.setPrizerecordid(pid);
			//e.setCreatetime(new Date().getTime());
			insertObjec(e);
			resid = pid;
		}
		
		return resid;
	}


	public void updateLvzPrizeRecordEntity(LvzPrizeRecordEntity e) throws Exception {
		updateObject(e);
	}

	public LvzPrizeRecordEntity getLvzPrizeRecordEntityById(long LvzPrizeRecordid) throws Exception {
		return (LvzPrizeRecordEntity)getObjectByid(LvzPrizeRecordid,LvzPrizeRecordEntity.class);
	}
	
	public List<LvzPrizeRecordEntity> getLvzPrizeRecordEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<LvzPrizeRecordEntity>) getListBypage(LvzPrizeRecordEntity.class,
				condition, pageindex, pagesize, orderby);
	}
	
	public int getCount(String condition) throws Exception {
		return this.getCountBycondition(LvzPrizeRecordEntity.class, condition);
	}
	

	
}


