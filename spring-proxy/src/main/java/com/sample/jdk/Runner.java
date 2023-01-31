package com.sample.jdk;

import com.sample.dao.PersonDao;
import com.sample.dao.PersonDaoImpl;
import java.lang.reflect.Proxy;

public class Runner {

  public static void main(String[] args) {
    PersonDao personDao = (PersonDao) Proxy.newProxyInstance(PersonDao.class.getClassLoader(), PersonDaoImpl.class.getInterfaces(),
        new PersonDaoInvocationHandler(new PersonDaoImpl()));

    personDao.find(4);
  }
}
