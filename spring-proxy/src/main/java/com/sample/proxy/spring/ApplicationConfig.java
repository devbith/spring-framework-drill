package com.sample.proxy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class ApplicationConfig {

  @Bean
  SpringBean springBean() {
    System.out.println("Creating singleton SpringBean in: "+getClass().getSimpleName());
    System.out.println("This method will be called only once by Enhancer by Spring CGLIB");
    return new SpringBean();
  }
}
