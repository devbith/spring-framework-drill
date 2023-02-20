package com.sample.definitions.configuration_level;

import com.sample.definitions.configuration_level.service.FinancialReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.registerShutdownHook();

    context.getEnvironment().setActiveProfiles("file");
    context.register(ApplicationConfiguration.class);
    context.refresh();

    FinancialReportService financialReportService = context.getBean(FinancialReportService.class);
    financialReportService.generateReport();

  }

}
