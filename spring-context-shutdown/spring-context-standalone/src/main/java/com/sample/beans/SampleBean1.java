package com.sample.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SampleBean1 {


  @PostConstruct
  private void initializeSomething() {
    System.out.println("SampleBean1.initializeSomething");
  }


  @PreDestroy
  private void endSomething() {
    System.out.println("SampleBean1.endSomething");
  }

  public void printSomething() {
    System.out.println("It's a great day");
  }

}
