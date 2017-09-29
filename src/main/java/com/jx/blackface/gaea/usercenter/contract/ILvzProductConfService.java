
package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;
import com.jx.blackface.gaea.usercenter.entity.LvzProductConfEntity;
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
public interface ILvzProductConfService {


	@OperationContract
	public long addLvzProductConfEntity(LvzProductConfEntity e)throws Exception;
	@OperationContract
	public LvzProductConfEntity getLvzProductConfEntityById(long LvzProductConfid)throws Exception; 
	@OperationContract
	public void delLvzProductConfEntity(long id) throws Exception ;
	@OperationContract
	public List<LvzProductConfEntity> getLvzProductConfEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateLvzProductConfEntity(LvzProductConfEntity e)throws Exception;
	@OperationContract
	public int getCount(String condition)throws Exception;

}

