package com.sample.proxy.manual;

import com.sample.dao.PersonDao;
import com.sample.dao.PersonDaoImpl;
import com.sample.dto.Person;

public class Runner {

  public static void main(String[] args) {
    PersonDao personDao = new PersonDaoProxy(new PersonDaoImpl());

    personDao.find(4);
    personDao.save(new Person());
  }

}
