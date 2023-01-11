package org.sample;

import org.sample.beans.SpringBeanB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfig {

  @Bean(destroyMethod = "finalizeSomethingHere")
  public SpringBeanB springBeanB() {
    return new SpringBeanB();
  }

}
