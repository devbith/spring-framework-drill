package com.sample.with.aop;

import com.sample.with.aop.action.ComplexReportAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) throws InterruptedException {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    applicationContext.registerShutdownHook();

    ComplexReportAction action = applicationContext.getBean(ComplexReportAction.class);
    action.perform();
  }

}
