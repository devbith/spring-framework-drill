package com.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

    SpringBeanExample bean = context.getBean(SpringBeanExample.class);

    System.out.println(bean);

    context.registerShutdownHook();


  }

}