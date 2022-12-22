package com.sample.config;

import com.sample.beans.SpringBean5;
import com.sample.beans.SpringBean6;
import com.sample.beans.SpringBean7;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(lazyInit = true, basePackages = "com.sample")
//@Lazy
public class ApplicationConfiguration {

  @Bean
  public SpringBean5 springBean5() {
    return new SpringBean5();
  }

  @Bean
  public SpringBean6 springBean6() {
    return new SpringBean6();
  }

  @Bean
  @Lazy
  public SpringBean7 springBean7() {
    return new SpringBean7();
  }

}
