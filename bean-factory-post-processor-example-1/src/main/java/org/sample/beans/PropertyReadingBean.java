package org.sample.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyReadingBean {

  @Value("${app.id}")
  private String appId;

  @Value("${app.name}")
  private String appName;

  @Override
  public String toString() {
    return "PropertyReadingBean{" +
        "appId='" + appId + '\'' +
        ", appName='" + appName + '\'' +
        '}';
  }
}
