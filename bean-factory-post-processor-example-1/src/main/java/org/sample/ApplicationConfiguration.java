package org.sample;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("classpath:/app-default.properties")
public class ApplicationConfiguration {

  /**
   * BeanFactoryPostProcessor is also a Spring Bean, but a special kind of Bean that should be invoked before other types of beans get created,
   * Spring needs to have ability to create it before any other beans.
   * This is why BeanFactoryPostProcessors needs to be registered from static method level.
   */
  @Bean
  public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
    return new CustomBeanFactoryPostProcessor();
  }

}
