package com.sample;

import com.sample.beans.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfig {

  @Bean(initMethod = "springBean1InitMethod")
  public SpringBean2 springBean2() {
    return new SpringBean2();
  }

}
