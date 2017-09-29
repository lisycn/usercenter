package com.jx.blackface.gaea.usercenter.components;

import java.util.List;

import com.jx.spat.gaea.server.contract.annotation.ServiceBehavior;
import com.jx.blackface.gaea.usercenter.contract.IAreasService;
import com.jx.blackface.gaea.usercenter.entity.BFAreasEntity;
@ServiceBehavior
public class AreasService extends CommonService implements IAreasService {

	public BFAreasEntity getAeasEntityById(long Aeasid) throws Exception {
		return (BFAreasEntity)getObjectByid(Aeasid,BFAreasEntity.class);
	}

	public List<BFAreasEntity> getAeasEntity(String condition, int pageindex,
			int pagesize, String orderby) throws Exception {
		return (List<BFAreasEntity>) getListBypage(BFAreasEntity.class, condition, pageindex, pagesize, orderby);
	}

	public void updateAeasEntity(BFAreasEntity e) throws Exception {
		updateObject(e);
	}

	public int getCountAreaEntity(String condition) throws Exception{
		return getCountBycondition(BFAreasEntity.class, condition);
	}
	

}
