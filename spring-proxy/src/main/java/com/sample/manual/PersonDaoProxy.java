package com.sample.manual;

import com.sample.dao.PersonDao;
import com.sample.dto.Person;

public class PersonDaoProxy implements PersonDao {

  private PersonDao personDao;

  public PersonDaoProxy(PersonDao personDao) {
    this.personDao = personDao;
  }

  @Override
  public Person find(int id) {
    System.out.println("before finding person by id: " + id);
    Person person = this.personDao.find(id);
    System.out.println("after finding person by id: " + id);
    return person;
  }

  @Override
  public void save(Person person) {
    System.out.println("before saving person");
    personDao.save(person);
    System.out.println("after saving person");

  }
}
