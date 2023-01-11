package org.sample.beans;

public class SpringBeanB {

  public void finalizeSomethingHere() {
    System.out.println("SpringBeanB.finalizeSomethingHere @Bean(destroyMethod = \"finalizeSomethingHere\")");
  }
}
