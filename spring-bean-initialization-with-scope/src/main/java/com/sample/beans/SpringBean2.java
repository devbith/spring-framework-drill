package com.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {

  public SpringBean2() {
    System.out.println("SpringBean2:: Singleton Bean");
  }
}
