package com.sample.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {


  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sample");
    context.registerShutdownHook();
  }

}