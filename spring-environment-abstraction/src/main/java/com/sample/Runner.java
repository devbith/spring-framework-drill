package com.sample;

import com.sample.beans.SpringBean1;
import java.util.Arrays;
import java.util.Map;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

public class Runner {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.registerShutdownHook();

    ConfigurableEnvironment environment = context.getEnvironment();
    printEnvironmentProperties(environment);

    context.register(AppConfig.class);
    environment.setActiveProfiles("dev");
    context.refresh();

    environment = context.getEnvironment(); // Get environment after registering new configuration

    environment.getPropertySources();
    printEnvironmentProperties(environment);

    SpringBean1 bean = context.getBean(SpringBean1.class);
    System.out.println(bean);
  }

  public static void printEnvironmentProperties(ConfigurableEnvironment environment) {
    System.out.println("Active profiles: ");
    Arrays.stream(environment.getActiveProfiles()).forEach(System.out::println);

    environment.getPropertySources().forEach(propertySource -> {
      System.out.println(propertySource);
    });


  }

}

