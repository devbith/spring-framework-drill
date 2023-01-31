package com.sample.dao;

import com.sample.dto.Person;

public interface PersonDao {

  Person find(int id);

void save(Person person);

}
