package com.sample.dao;

import com.sample.dto.Person;

public class PersonDaoImpl implements PersonDao {

  @Override
  public Person find(int id) {
    System.out.println("PersonDaoImpl: Searching person with id ");
    return new Person();
  }

  @Override
  public void save(Person person) {
    System.out.println("PersonDaoImpl: Saving person ");
  }
}
