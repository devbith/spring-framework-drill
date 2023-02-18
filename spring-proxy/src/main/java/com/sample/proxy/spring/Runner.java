package com.sample.proxy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    SpringBean bean1 = applicationContext.getBean(SpringBean.class);
    SpringBean bean2 = applicationContext.getBean(SpringBean.class);
    applicationContext.registerShutdownHook();
  }

}
