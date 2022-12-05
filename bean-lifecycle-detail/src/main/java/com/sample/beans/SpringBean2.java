package com.sample.beans;

public class SpringBean2 {


  public SpringBean2() {
    System.out.println(getClass().getSimpleName()+"::constructor");
  }

  public void initializeSomething() {
    System.out.println("SpringBean2.initialize");
  }

  public void destroySomething() {
    System.out.println("SpringBean2.destroySomething");
  }
}
