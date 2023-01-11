package org.sample.beans;

import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanA {

  @PreDestroy
  public void finalizeSomethingHere() {
    System.out.println("SpringBeanA.finalizeSomethingHere method annotates @PreDestroy");
  }


}
