package com.sample.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class SpringBean3 {

  public SpringBean3() {
    System.out.println("SpringBean3:: Prototype Bean");
  }
}
