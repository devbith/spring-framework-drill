package com.sample.beans;

public class SpringBean2B implements SpringBean2 {


  @Override
  public void printHash() {
    System.out.println(getClass().getSimpleName()+": yellowyellowdirtyfellow");
  }
}
