package com.sample.with.aop.service;

import com.sample.with.aop.annotations.PerformanceLogger;
import com.sample.with.aop.dto.FormattedReport;
import com.sample.with.aop.dto.Report;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Component;

@Component
public class ComplexReportFormatter {

  @PerformanceLogger
  public FormattedReport formatReport(Report report) throws InterruptedException {
    System.out.println("Formatting report...");
    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
    System.out.println("Report formatted...");

    return new FormattedReport(report);
  }
}
