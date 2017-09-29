
package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.LvzAddressConfEntity;
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
public interface ILvzAddressConfService {


	@OperationContract
	public long addLvzAddressConfEntity(LvzAddressConfEntity e)throws Exception;
	@OperationContract
	public LvzAddressConfEntity getLvzAddressConfEntityById(long LvzAddressConfid)throws Exception; 
	@OperationContract
	public void delLvzAddressConfEntity(long id) throws Exception ;
	@OperationContract
	public List<LvzAddressConfEntity> getLvzAddressConfEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateLvzAddressConfEntity(LvzAddressConfEntity e)throws Exception;
	@OperationContract
	public int getCount(String condition)throws Exception;

}

