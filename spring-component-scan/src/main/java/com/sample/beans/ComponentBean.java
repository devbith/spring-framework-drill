package com.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class ComponentBean {

  public ComponentBean() {
    System.out.println("ComponentBean::constructor");
  }

}
