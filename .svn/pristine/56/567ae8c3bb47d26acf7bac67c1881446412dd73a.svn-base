
package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;
import com.jx.blackface.gaea.usercenter.entity.LvzPrizeRecordEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;


/**
 * @author bruce
 * @date 2016-06-20
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */

@ServiceContract
public interface ILvzPrizeRecordService {


	@OperationContract
	public long addLvzPrizeRecordEntity(LvzPrizeRecordEntity e)throws Exception;
	@OperationContract
	public LvzPrizeRecordEntity getLvzPrizeRecordEntityById(long LvzPrizeRecordid)throws Exception; 
	@OperationContract
	public List<LvzPrizeRecordEntity> getLvzPrizeRecordEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateLvzPrizeRecordEntity(LvzPrizeRecordEntity e)throws Exception;
	@OperationContract
	public int getCount(String condition)throws Exception;


}

