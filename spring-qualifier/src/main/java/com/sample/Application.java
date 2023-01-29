package com.sample;

import com.sample.service.RecordService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sample");

    RecordService recordService = context.getBean(RecordService.class);
    recordService.processRecord();

    context.registerShutdownHook();;

  }

}
