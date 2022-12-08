package com.sample.beans;

public class Bar {

  public Bar() {
    System.out.println("constructor Bar");
  }

  public void initializeSomething() {
    System.out.println("Bar.initializeSomething called from @Bean(initMethod)");
  }

  public void destroySomething() {
    System.out.println("Bar.destroySomething called from @Bean(destroyMethod) ");
  }

}
