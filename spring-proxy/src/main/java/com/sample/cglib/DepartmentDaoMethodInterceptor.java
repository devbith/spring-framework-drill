package com.sample.cglib;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class DepartmentDaoMethodInterceptor implements MethodInterceptor {

  @Override
  public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
    System.out.println("before "+method.getName());
    Object result = methodProxy.invokeSuper(object, args);
    System.out.println("after "+method.getName());
    return result;
  }
}
