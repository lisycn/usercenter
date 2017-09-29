package com.jx.blackface.gaea.usercenter.components;

import java.util.List;

import com.jx.blackface.gaea.usercenter.common.DBHelper;


public class CommonService {
	public void insertObjec(Object  t)throws Exception{
		DBHelper.daoHelpers.sql.insert(t);
	}
	public Object getObjectByid(long id,Class<?> clz)throws Exception{
		return DBHelper.daoHelpers.sql.get(clz, id);
	}
	public void updateObject(Object o)throws Exception{
		DBHelper.daoHelpers.sql.upateEntity(o);
	}
	public void deleteObjectByid(Class<?> clz,long id)throws Exception{
		DBHelper.daoHelpers.sql.deleteByID(clz, id);
	}
	public List <?> getListBypage(Class clz,String condition,
			int pageindex,int pagesize,String orderby)throws Exception{
		return DBHelper.daoHelpers.sql.getListByPage(clz, condition, "*", pageindex, pagesize, orderby);
		
	}
	public List <?> getListByCustom(Class<?> clz,String condition,String orderby)throws Exception{
		return DBHelper.daoHelpers.sql.getListByCustom(clz, "*", condition, orderby);
	}
	
	public List <?> getListBySQL(Class<?> clz, String sql,Object[] param) throws Exception{
		return DBHelper.daoHelpers.sql.getListBySQL(clz, sql, param);
	}
	
	
	public int getCountBycondition(Class<?> clz,String condition)throws Exception{
		return DBHelper.daoHelpers.sql.getCount(clz, condition);
	}

}
