package com.sample;

import java.util.Arrays;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
    System.out.println(getClass().getSimpleName() + "::postProcessorBeanFactory Listening Beans Start");
    Arrays.stream(configurableListableBeanFactory.getBeanDefinitionNames()).forEach(System.out::println);
    BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("springBean1");
    System.out.println(getClass().getSimpleName() + "::postProcessorBeanFactory Listening Beans Ends");
  }
}
