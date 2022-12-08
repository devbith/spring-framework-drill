package com.sample;


import com.sample.beans.Bar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.sample")
public class Runner {

  public static void main(String[] args) {
    SpringApplication.run(Runner.class, args);
  }


  @Bean(initMethod = "initializeSomething", destroyMethod = "destroySomething")
  public Bar bar() {
    return new Bar();
  }

}