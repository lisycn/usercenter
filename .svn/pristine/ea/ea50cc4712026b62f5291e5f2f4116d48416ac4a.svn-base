
package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;
import com.jx.blackface.gaea.usercenter.entity.LvzMenuEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;


/**
 * @author bruce
 * @date 2016-06-27
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */

@ServiceContract
public interface ILvzMenuService {


	@OperationContract
	public long addLvzMenuEntity(LvzMenuEntity e)throws Exception;
	@OperationContract
	public LvzMenuEntity getLvzMenuEntityById(long LvzMenuid)throws Exception; 
	@OperationContract
	public void delLvzMenuEntity(long id) throws Exception ;
	@OperationContract
	public List<LvzMenuEntity> getLvzMenuEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateLvzMenuEntity(LvzMenuEntity e)throws Exception;
	@OperationContract
	public int getCount(String condition)throws Exception;

}

