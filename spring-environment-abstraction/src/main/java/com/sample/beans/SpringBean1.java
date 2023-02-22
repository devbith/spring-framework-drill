package com.sample.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

  @Value("${app.name}")
  public String name;

  @Value("${JAVA_HOME}")
  public String javaHome;

  @Override
  public String toString() {
    return "SpringBean1{" +
        "name='" + name + '\'' +
        ", javaHome='" + javaHome + '\'' +
        '}';
  }
}
