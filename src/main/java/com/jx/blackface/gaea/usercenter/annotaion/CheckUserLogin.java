package com.jx.blackface.gaea.usercenter.annotaion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.jx.argo.interceptor.PreInterceptorAnnotation;
import com.jx.blackface.gaea.usercenter.annotaion.impl.CheckUserLoginImpl;

@PreInterceptorAnnotation(CheckUserLoginImpl.class)
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Deprecated  //已过期
public @interface CheckUserLogin {

}
