package com.sample;

import com.sample.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

 public static void main(String[] args) {
  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
  context.registerShutdownHook();

  SpringBean1 springBean1 = context.getBean(SpringBean1.class);
  System.out.println(springBean1);

 }

}

