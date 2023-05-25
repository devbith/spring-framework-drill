package com.sample;

import com.sample.service.EmployeeReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    context.registerShutdownHook();

    EmployeeReportService employeeReportService = context.getBean(EmployeeReportService.class);
    employeeReportService.printReport();
  }
}
