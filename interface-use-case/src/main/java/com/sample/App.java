package com.sample;


import com.sample.service.FinancialReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {

    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sample");

        FinancialReportService financialReportService = context.getBean(FinancialReportService.class);

        financialReportService.generateReport();

    }

}
