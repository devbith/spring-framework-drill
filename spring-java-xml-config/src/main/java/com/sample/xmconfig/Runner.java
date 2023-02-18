package com.sample.xmconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("my-bean-config.xml");
    xmlApplicationContext.registerShutdownHook();
  }

}
