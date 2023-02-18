package com.sample.javaconfig;

import com.sample.beans.SpringBean1;
import com.sample.beans.SpringBean3;
import org.springframework.context.annotation.Bean;

/**
 * In Java based configuration, class can be marked as final
 */
public final class AppConfig {

  @Bean
  public final SpringBean3 springBean3() {
    System.out.println("Creating SpringBean3 with Java configuration: " + getClass().getSimpleName());
    return new SpringBean3(new SpringBean1());
  }

}
