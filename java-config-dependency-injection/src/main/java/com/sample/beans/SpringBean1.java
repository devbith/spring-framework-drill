package com.sample.beans;

public class SpringBean1 {

  private SpringBean2 springBean2;
  private SpringBean3 springBean3;

  public SpringBean1(SpringBean2 springBean2, SpringBean3 springBean3) {
    this.springBean2 = springBean2;
    this.springBean3 = springBean3;
  }

  public void printProperties() {
    System.out.println(springBean2.getClass());
    System.out.println(springBean3.getClass());
  }

  
}
