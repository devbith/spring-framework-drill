package com.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {

  public static String staticProperty = "static property";
  public String property = "instance property";

  public String method() {
    return "value from instance method ";
  }

  public static String staticMethod() {
    return "value from static method";
  }

}
