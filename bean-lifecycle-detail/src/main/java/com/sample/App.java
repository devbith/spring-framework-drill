package com.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {

    System.out.println("Staring application-context");
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sample");


    System.out.println("Closing application-context (bean-factory)");
    context.close();


  }
}