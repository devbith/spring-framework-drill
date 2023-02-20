package com.sample.definitions.custom_annotation;

import com.sample.definitions.custom_annotation.service.FinancialReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.registerShutdownHook();

    context.getEnvironment().setActiveProfiles("file");
    context.register(AppConfiguration.class);
    context.refresh();

    FinancialReportService financialReportService = context.getBean(FinancialReportService.class);
    financialReportService.generateReport();
  }

}
