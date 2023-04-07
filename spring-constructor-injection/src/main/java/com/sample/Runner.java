package com.sample;

import com.sample.bean.SpringBeanD;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

 public static void main(String[] args) {

  AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.sample");
  applicationContext.registerShutdownHook();

  SpringBeanD springBeanD = applicationContext.getBean(SpringBeanD.class);
  System.out.println(springBeanD);

 }

}

