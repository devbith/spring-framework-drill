package com.sample.beans;

public class SpringBean3 {

  private SpringBean1 springBean1;
  private SpringBean2 springBean2;

  public SpringBean3(SpringBean1 springBean1, SpringBean2 springBean2) {
    this.springBean1 = springBean1;
    this.springBean2 = springBean2;
    System.out.println(getClass().getSimpleName()+" dependency injected");
  }

  public void initializeSomething() {
    System.out.println(getClass().getSimpleName()+": initializeSomething method called after injecting the dependency");

    System.out.println(getClass().getSimpleName()+": initializeSomething --> Calling SpringBean2 printHash method");
    springBean2.printHash();
  }

}

