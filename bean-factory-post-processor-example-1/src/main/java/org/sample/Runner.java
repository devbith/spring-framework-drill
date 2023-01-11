package org.sample;

import org.sample.beans.PropertyReadingBean;
import org.sample.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    context.registerShutdownHook();

    SpringBean1 bean = context.getBean(SpringBean1.class);

    PropertyReadingBean propertyReadingBean = context.getBean(PropertyReadingBean.class);

    System.out.println(propertyReadingBean);


  }
}