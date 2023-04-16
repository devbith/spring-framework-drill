package com.sample.no.aop.service;

import com.sample.no.aop.dto.FormattedReport;
import com.sample.no.aop.dto.Report;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Component;

@Component
public class ComplexReportFormatter {

  public FormattedReport formatReport(Report report) throws InterruptedException {
    System.out.println("Formatting report...");
    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
    System.out.println("Report formatted...");

    return new FormattedReport(report);
  }
}
