package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.sample")
public class Runner {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);

    SampleBean bean = context.getBean(SampleBean.class);
    System.out.println(bean);
  }

}
