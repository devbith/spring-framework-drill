package com.sample;

import com.sample.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

    SpringBean1 bean = applicationContext.getBean(SpringBean1.class);

    bean.printProperties();

    applicationContext.registerShutdownHook();

  }
}