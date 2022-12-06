package com.sample;

import com.sample.beans.SampleBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner1 {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sample");

    context.registerShutdownHook(); // Recommended way to close the application-context

    SampleBean1 bean = context.getBean(SampleBean1.class);
    bean.printSomething();
  }
}