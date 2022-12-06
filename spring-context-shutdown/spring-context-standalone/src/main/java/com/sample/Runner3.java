package com.sample;

import com.sample.beans.SampleBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner3 {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sample");
    //context.close();
    SampleBean1 bean = context.getBean(SampleBean1.class); // Throw Runtime Exception if above line is uncommented
    bean.printSomething();

    context.close();
  }

}
