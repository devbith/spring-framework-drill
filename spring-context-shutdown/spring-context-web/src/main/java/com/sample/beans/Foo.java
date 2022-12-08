package com.sample.beans;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Foo {

  public Foo() {
    System.out.println("Constructor Foo");
  }

  @PostConstruct
  public void initializeSomething() {
    System.out.println("Foo.initializeSomething");
  }

  @PreDestroy
  public void destroySomething() {
    System.out.println("Foo.destroySomething");
  }

}
