package com.sample;

import com.sample.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Runner {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);
    context.registerShutdownHook();

    EmployeeService employeeService = context.getBean(EmployeeService.class);
    employeeService.printReport();


  }
}