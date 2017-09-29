package com.jx.blackface.gaea.usercenter.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import com.alibaba.fastjson.JSON;
import com.jx.blackface.gaea.usercenter.components.LoginService;
import com.jx.blackface.gaea.usercenter.contract.ILoginService;
import com.jx.blackface.gaea.usercenter.entity.BFLoginEntity;

public class CookieUtils {
	
	public static final String cookieName = "lvuser";
	
	/**
     * 从cookie中获取用户id
     * @param request
     * @return
     */
    public static long getUseridFromCookie(HttpServletRequest request){
    	long userid = 0;
	     //根据cookieName取cookieValue 
		 Cookie cookies[] = request.getCookies();
        String cookieValue = null; 
        if(cookies!=null){ 
           for(int i=0;i<cookies.length; i++){
              if (cookieName.equals(cookies[i].getName())) { 
                 cookieValue = cookies[i].getValue(); 
                 break; 
              } 
           }
        }
        if(StringUtils.isNotBlank(cookieValue)){
			if(StringUtils.contains(cookieValue, ":")){
				String[] splitCookieValues = StringUtils.split(cookieValue, ":");
				if(splitCookieValues.length > 0 && StringUtils.isNotBlank(splitCookieValues[0])){
					userid =Long.valueOf(splitCookieValues[0]) ;
				}
			}else{
				userid = Long.valueOf(cookieValue);
			}
		}
    	return userid;
    }
	
	/***
	 * 检查此cookie名称是否存在且值不为空 
	 * @param cookicName
	 * @param request
	 * @return true 不为空 false 为空
	 * @throws Exception
	 */
    public static boolean checkCookieName(HttpServletRequest request) throws Exception{ 
	     //根据cookieName取cookieValue 
		 Cookie cookies[] = request.getCookies();
	System.out.println("获取的cookie:"+JSON.toJSONString(cookies));
         String cookieValue = null; 
         if(cookies!=null){ 
            for(int i=0;i<cookies.length; i++){
            	System.out.println("=======:"+cookies[i].getName()+"==="+cookies[i].getValue());
               if (cookieName.equals(cookies[i].getName())) { 
                  cookieValue = cookies[i].getValue(); 
                  break; 
               } 
            }
         } 
         //如果cookieValue为空,返回, 
         if(cookieValue==null){ 
        	 return false;
         }
         return true;
     }
	
	/***
	 * 检查此cookie名称是否存在且值不为空 
	 * @param cookicName
	 * @param request
	 * @return true 不为空 false 为空
	 * @throws Exception
	 */
    public static boolean checkCookieName(String cookicName,HttpServletRequest request) throws Exception{ 
	     //根据cookieName取cookieValue 
		 Cookie cookies[] = request.getCookies();
	System.out.println("获取的cookie:"+JSON.toJSONString(cookies));
        String cookieValue = null; 
        if(cookies!=null){ 
           for(int i=0;i<cookies.length; i++){
           	System.out.println("=======:"+cookies[i].getName()+"==="+cookies[i].getValue());
              if (cookicName.equals(cookies[i].getName())) { 
                 cookieValue = cookies[i].getValue(); 
                 break; 
              } 
           }
        } 
        //如果cookieValue为空,返回, 
        if(cookieValue==null){ 
       	 return false;
        }
        return true;
     } 
    
    /***
     * 根据cookie名称取cookie的值  (注:使用值时需要看下值是否需要处理)
     * @param cookieName
     * @param request
     * @return 
     */
    public static String getCookieValueByName(String cookieName,HttpServletRequest request) throws Exception{
    	//根据cookieName取cookieValue 
		Cookie cookies[] = request.getCookies(); 
        String cookieValue = ""; 
        if(cookies!=null){ 
           for(int i=0;i<cookies.length; i++){
              if (cookieName.equals(cookies[i].getName())) {
                 cookieValue = cookies[i].getValue(); 
                 break; 
              } 
           }
        }
        return cookieValue;
    }
    
    /***
	 * 从cookie中获取用户id
	 * @param request
	 */
	public static String getUserIdFormCookie(String cookieName,HttpServletRequest request){
		String userid="";
		try {
			String cookieValues = CookieUtils.getCookieValueByName(cookieName, request);
			if(StringUtils.isNotBlank(cookieValues)){
				if(StringUtils.contains(cookieValues, ":")){
					String[] splitCookieValues = StringUtils.split(cookieValues, ":");
					if(splitCookieValues.length > 0 && StringUtils.isNotBlank(splitCookieValues[0])){
						userid = splitCookieValues[0];
					}
				}else{
					userid = cookieValues;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userid;
	}
    
//    /**
//     * 删除指定名称的cookie
//     * @param request
//     * @param response
//     */
//    public static void deleteCookie(String cookieName,HttpServletRequest request, HttpServletResponse response) throws Exception{
//    	 Cookie cookies[] = request.getCookies(); 
//    	 if(cookies!=null){ 
//             for(int i=0;i<cookies.length; i++){
//                    if (cookieName.equals(cookies[i].getName())) { 
//                    	Cookie cookie = new Cookie(cookieName,null);
//                        cookie.setMaxAge(0);
//                        cookie.setPath("/");
//                        cookie.setDomain(".lvzheng.com");
//                        response.addCookie(cookie);
//                        break;
//                    } 
//             }
//      } 
//    }
    
    
    
    
}
