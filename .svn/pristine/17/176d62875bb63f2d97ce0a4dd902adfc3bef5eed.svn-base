package com.jx.blackface.gaea.usercenter.common;


/**
 * 生成唯一ID
 * 
 * @author chenchun
 * 
 */
public class IDHelper {

	/**
	 * 获取主键ID
	 * 
	 * @return
	 * @throws Exception
	 */
	public static synchronized long getUniqueID() throws Exception {
		if (Constants.SERVER_ID <= 0) {
			throw new Exception("server id error, please check config file!");
		}

		long destID = System.currentTimeMillis() - Constants.ID_BEGIN_TIME;
		destID = (destID << 8) | Constants.SERVER_ID;
		Thread.sleep(1);
		return destID;
	}

	/**
	 * 生成唯一ID,该ID的dbIndex与sourceID一至 注：最大支持库 ：512个 最大支持时间：4240-01-01
	 * 
	 * @param sourceID
	 * @return
	 * @throws Exception
	 */
	public static synchronized long getUniqueID(long sourceID) throws Exception {
		if (Constants.SERVER_ID <= 0) {
			throw new Exception("server id error, please check config file!");
		}

		int sourceIndex = getDBIndex(sourceID);
		long destID = System.currentTimeMillis() - Constants.ID_BEGIN_TIME;
		destID = (destID << 9) | sourceIndex;
		destID = (destID << 8) | Constants.SERVER_ID;
		Thread.sleep(1);
		return destID;
	}

	/**
	 * 获取ID所对应该的数据库编号
	 * 
	 * @param ID
	 * @return 数据库
	 */
	public static int getDBIndex(long id) {
		return (int) ((id >> 8) & (Constants.DB_COUNT - 1));
	}
}