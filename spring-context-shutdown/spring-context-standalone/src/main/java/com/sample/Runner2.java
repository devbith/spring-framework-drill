package com.sample;

import com.sample.beans.SampleBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner2 {

  public static void main(String[] args) {

    /*
     * AnnotationConfigApplicationContext Is-a AutoCloseable so try-with-resource with automatically call
     * the method close() and close the context
    */
    try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sample")) {
      SampleBean1 bean = context.getBean(SampleBean1.class);
      bean.printSomething();
    }
  }
}