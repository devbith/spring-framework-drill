package com.sample.beans;

import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {

  public SpringBean2() {
    System.out.println(getClass().getSimpleName() + "::constructor");
  }

  @PreDestroy
  public void destroy() {
    System.out.println(getClass().getSimpleName() + "::destroy");
  }

}
