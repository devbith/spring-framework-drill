package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  private static final Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {

    var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    logger.info("{}", ctx.getBean("myBean"));
    ctx.close();

  }
}