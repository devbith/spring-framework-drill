package org.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

  public SpringBean1() {
    System.out.println("SpringBean1 was a singleton scope until it's scope got modified by CustomBeanFactoryPostProcessor::postProcessBeanFactory ");
  }
}
