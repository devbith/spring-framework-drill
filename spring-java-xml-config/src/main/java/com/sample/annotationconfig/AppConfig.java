package com.sample.annotationconfig;


import com.sample.beans.SpringBean1;
import com.sample.beans.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * In Annotation based configuration class can't be marked as final
 * since, Spring makes a proxy of AppConfig by using CGLIB proxy to invoke the method aka create bean in this case
 */
@Configuration
public class AppConfig {

  @Bean
  public SpringBean3 springBean3() {
    System.out.println("Creating SpringBean3 with annotation configuration: "+getClass().getSimpleName());
    return new SpringBean3(new SpringBean1());
  }

}
