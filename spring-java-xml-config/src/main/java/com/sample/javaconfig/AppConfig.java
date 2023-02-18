package com.sample.javaconfig;

import com.sample.beans.SpringBean1;
import com.sample.beans.SpringBean2;
import com.sample.beans.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public SpringBean3 springBean3() {
//    return new SpringBean3(new SpringBean2());  // <-- Doesn't compile due to type checking, advantage over xml config
    return new SpringBean3(new SpringBean1());
  }

}
