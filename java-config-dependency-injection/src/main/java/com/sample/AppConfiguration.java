package com.sample;

import com.sample.beans.SpringBean1;
import com.sample.beans.SpringBean2;
import com.sample.beans.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {


  @Bean
  public SpringBean1 springBean1(SpringBean2 springBean2, SpringBean3 springBean3) {
    return new SpringBean1(springBean2, springBean3);
  }

  @Bean
  public SpringBean2 springBean2() {
    return new SpringBean2();
  }

  @Bean
  public SpringBean3 springBean3() {
    return new SpringBean3();
  }



}
