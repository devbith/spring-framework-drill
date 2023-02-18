package com.sample.annotationconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.sample");
    applicationContext.registerShutdownHook();
  }

}
