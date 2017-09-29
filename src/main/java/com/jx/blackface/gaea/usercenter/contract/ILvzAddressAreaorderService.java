
package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;
import com.jx.blackface.gaea.usercenter.entity.LvzAddressAreaorderEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;


/**
 * @author bruce
 * @date 2016-08-23
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */

@ServiceContract
public interface ILvzAddressAreaorderService {


	@OperationContract
	public long addLvzAddressAreaorderEntity(LvzAddressAreaorderEntity e)throws Exception;
	@OperationContract
	public LvzAddressAreaorderEntity getLvzAddressAreaorderEntityById(long LvzAddressAreaorderid)throws Exception; 
	@OperationContract
	public List<LvzAddressAreaorderEntity> getLvzAddressAreaorderEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateLvzAddressAreaorderEntity(LvzAddressAreaorderEntity e)throws Exception;
	@OperationContract
	public int getCount(String condition)throws Exception;

}

