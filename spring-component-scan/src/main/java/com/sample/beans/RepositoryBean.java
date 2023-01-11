package com.sample.beans;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryBean {

  public RepositoryBean() {
    System.out.println("RepositoryBean::constructor");
  }
}
