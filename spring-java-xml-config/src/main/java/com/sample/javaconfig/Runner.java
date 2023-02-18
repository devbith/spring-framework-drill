package com.sample.javaconfig;

import com.sample.beans.SpringBean3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    SpringBean3 bean = context.getBean(SpringBean3.class);
    context.registerShutdownHook();
  }

}
