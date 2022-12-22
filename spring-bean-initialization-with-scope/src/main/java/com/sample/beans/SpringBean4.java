package com.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean4 {

  private final SpringBean3 springBean3;

  public SpringBean4(SpringBean3 springBean3) {
    this.springBean3 = springBean3;
    System.out.println("SpringBean4:: Singleton Bean");
  }

}
