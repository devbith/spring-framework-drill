package com.sample;

import com.sample.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

 public static void main(String[] args) {
  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
  context.registerShutdownHook();

  Bar bar = context.getBean(Bar.class);
  Foo foo = context.getBean(Foo.class);

  bar.barMethod();
  foo.fooMethod();

 }



}

