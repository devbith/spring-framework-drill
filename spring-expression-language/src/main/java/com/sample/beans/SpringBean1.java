package com.sample.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

  @Value("#{T(com.sample.beans.SpringBean2).staticMethod()}")
  private String staticMethodExecutionResult;

  @Value("#{T(com.sample.beans.SpringBean2).staticProperty}")
  private String staticValueFetchResult;

  @Value("#{@springBean2.property} ")
  private String propertyValue;

  @Value("#{@springBean2.method()}")
  private String methodValue;

  @Value("#{environment['app.file.property']}")
  private String appFileProperty;

  @Value("#{systemProperties['app.vm.property']}")
  private String appVMProperty;

  @Value("#{systemEnvironment['JAVA_HOME']}")
  private String javaHome;

  @Override
  public String toString() {
    return "SpringBean1{" +
        "staticMethodExecutionResult='" + staticMethodExecutionResult + '\'' +
        ", staticValueFetchResult='" + staticValueFetchResult + '\'' +
        ", propertyValue='" + propertyValue + '\'' +
        ", methodValue='" + methodValue + '\'' +
        ", appFileProperty='" + appFileProperty + '\'' +
        ", appVMProperty='" + appVMProperty + '\'' +
        ", javaHome='" + javaHome + '\'' +
        '}';
  }

  public String getStaticMethodExecutionResult() {
    return staticMethodExecutionResult;
  }

  public void setStaticMethodExecutionResult(String staticMethodExecutionResult) {
    this.staticMethodExecutionResult = staticMethodExecutionResult;
  }

  public String getStaticValueFetchResult() {
    return staticValueFetchResult;
  }

  public void setStaticValueFetchResult(String staticValueFetchResult) {
    this.staticValueFetchResult = staticValueFetchResult;
  }

  public String getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }

  public String getMethodValue() {
    return methodValue;
  }

  public void setMethodValue(String methodValue) {
    this.methodValue = methodValue;
  }

  public String getAppFileProperty() {
    return appFileProperty;
  }

  public void setAppFileProperty(String appFileProperty) {
    this.appFileProperty = appFileProperty;
  }

  public String getAppVMProperty() {
    return appVMProperty;
  }

  public void setAppVMProperty(String appVMProperty) {
    this.appVMProperty = appVMProperty;
  }

  public String getJavaHome() {
    return javaHome;
  }

  public void setJavaHome(String javaHome) {
    this.javaHome = javaHome;
  }
}
