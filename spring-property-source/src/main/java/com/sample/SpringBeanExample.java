package com.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanExample {

  @Value("${db.host}")
  private String dbHost;

  @Value("${app.home}")
  private String appHome;

  @Value("${HOME}")
  private String homePath;

  @Value("${hacker.name}")
  private String hackerName;

  @Override
  public String toString() {
    return "SpringBeanExample{" +
        "dbHost='" + dbHost + '\'' +
        ", appHome='" + appHome + '\'' +
        ", homePath='" + homePath + '\'' +
        ", hackerName='" + hackerName + '\'' +
        '}';
  }
}
