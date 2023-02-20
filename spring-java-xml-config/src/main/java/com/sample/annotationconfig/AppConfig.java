package com.sample.annotationconfig;


import com.sample.beans.SpringBean1;
import com.sample.beans.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * In Annotation based configuration
 * Spring uses CGLIB and makes a subclass of configuration class and makes the proxy invocation of the configuration class
 * thus, configuration class can't be marked as final
 *
 *  This is also a reason why methods cannot be final, Spring needs to override methods from parent class for proxy to work
 *   correctly, however final method cannot be overridden, having such a method will make CGLIB fail
 *
 *   If @Configuration class will be final or will have final method, Spring will throw BeanDefinitionParsingException.
 */
@Configuration
public class AppConfig {

  @Bean
  public SpringBean3 springBean3() {
    System.out.println("Creating SpringBean3 with annotation configuration: "+getClass().getSimpleName());
    return new SpringBean3(new SpringBean1());
  }

}
