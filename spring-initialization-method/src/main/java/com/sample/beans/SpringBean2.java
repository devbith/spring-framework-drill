package com.sample.beans;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 implements InitializingBean {

  private SpringBean1 springBean1;

  private String id;

  public SpringBean2() {
    System.out.println("SpringBean2:: no-arg(default) constructor");
  }

  public SpringBean2(String id) {
    this.id = id;
    System.out.println("SpringBean2::constructor");
  }

  @Autowired
  public void setSpringBean1(SpringBean1 springBean1) {
    System.out.println("SpringBean2::setSpringBean1");
    this.springBean1 = springBean1;
  }

  @PostConstruct
  public void doSomething() {
    System.out.println("SpringBean2::doSomething annotated with @PostConstruct");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("SpringBean2::afterPropertiesSet  from interface InitializingBean ");
  }

  public void springBean1InitMethod() {
    System.out.println("SpringBean2::springBean1InitMethod defined in @Bean(initMethod)");
  }

}
