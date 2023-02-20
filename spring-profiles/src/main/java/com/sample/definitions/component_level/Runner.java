package com.sample.definitions.component_level;

import com.sample.definitions.component_level.service.FinancialReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

 public static void main(String[] args) {
  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
  context.registerShutdownHook();

  // Activate profile
  context.getEnvironment().setActiveProfiles("file");
  context.register(ApplicationConfig.class);
  context.refresh();

  FinancialReportService financialReportService = context.getBean(FinancialReportService.class);
  financialReportService.generateReport();

 }

}

