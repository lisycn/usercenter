package com.jx.blackface.gaea.usercenter.common;

public class StringValue {
	private static String path = null;
	static{
		String nowpath = StringValue.class
				.getProtectionDomain().getCodeSource().getLocation().getPath();
		path = nowpath.substring(0, nowpath.lastIndexOf("/"));
	}
	//获取本jar包所在路径
	public static String getPath() {
		return path;
	}
}
