package com.sample;

import com.sample.beans.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationConfig {


  @Bean(initMethod = "initialSomething", destroyMethod = "destroySomething")
  public Bar bar() {
    return new Bar();
  }

}
