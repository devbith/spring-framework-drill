package com.sample.beans;

import org.springframework.stereotype.Service;

@Service
public class ServiceBean {

  public ServiceBean() {
    System.out.println("ServiceBean::constructor");
  }
}
