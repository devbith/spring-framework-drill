package com.sample.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
public class SpringBean1 {

  public SpringBean1() {
    System.out.println("SpringBean1:: Singleton Bean");
  }
}
