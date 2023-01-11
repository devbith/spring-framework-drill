package org.sample.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanC  implements DisposableBean {

  @Override
  public void destroy() throws Exception {
    System.out.println("SpringBeanC.destroy method called as SpringBeanC implements DisposableBean ");
  }
}
