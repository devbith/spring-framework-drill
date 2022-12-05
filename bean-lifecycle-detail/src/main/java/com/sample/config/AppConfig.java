package com.sample.config;

import com.sample.beans.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


  public AppConfig() {
    System.out.println(getClass().getSimpleName()+"::constructor");
  }

  @Bean(initMethod = "initializeSomething", destroyMethod = "destroySomething")
  public SpringBean2 springBean2() {
    return new SpringBean2();
  }

}
