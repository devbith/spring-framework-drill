package com.sample.jdk;

import com.sample.dao.PersonDao;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonDaoInvocationHandler implements InvocationHandler {

  private PersonDao target;

  public PersonDaoInvocationHandler(PersonDao target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("before "+method.getName());
    Object result = method.invoke(target, args);
    System.out.println("after "+method.getName());
    return result;
  }
}
