package com.sample.beans;

public class SpringBean1 {

  public void destroySomethingHere() {
    System.out.println(getClass().getSimpleName()+": destroySomething method called (bean might be discarded or context might be close)");
  }

}
