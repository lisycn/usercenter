package com.jx.blackface.gaea.usercenter.common;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bj58.sfft.utility.dao.basedao.DAOBase;
import com.bj58.sfft.utility.dao.basedao.DAOHelper;

public class DBHelper { 
	public static DAOHelper daoHelpers = null;
	private static Log log = LogFactory.getLog(DBHelper.class);
	static {
		try {
			//System.out.println("success ----------------------");
			String myFile = StringValue.getPath() + "/config/mysql.properties";
			File file = new File(myFile);
			System.out.println("----------daoHelpers初始化-----"+myFile);
			daoHelpers = DAOBase.createIntrance(myFile);
			
			//"/opt/scf_3.5/service/deploy/newzzjz/config/mysql.properties"，另外一处在constant.java总共写死两处，上线时记得修改
			//daoHelpers = DAOBase.createIntrance("/opt/scf_3.5/service/deploy/newzzjz/config/mysql.properties");
			//daoHelpers = DAOBase.createIntrance("E:/projeck/zzjz/com.bj58.diywebsite.scf/target/classes/config/mysql.properties");
		} catch (Exception ex) {
			ex.printStackTrace();
			log.error(ex);
		}
	}
}
