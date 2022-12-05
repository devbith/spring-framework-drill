package com.sample.beans;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

  private SpringBean2 springBean2;

  public SpringBean1() {
    System.out.println(getClass().getSimpleName()+"::constructor");
  }

  @PostConstruct
  public void initMethod() {
    System.out.println(getClass().getSimpleName()+"::initMethod");
  }


  @Autowired
  public void setSpringBean2(SpringBean2 springBean2) {
    System.out.println(getClass().getSimpleName()+"::setSpringBean2");
    this.springBean2 = springBean2;
  }
}
