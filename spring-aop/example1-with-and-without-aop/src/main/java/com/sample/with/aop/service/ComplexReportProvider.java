package com.sample.with.aop.service;

import com.sample.with.aop.annotations.PerformanceLogger;
import com.sample.with.aop.dto.Report;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Component;

@Component
public class ComplexReportProvider {

  @PerformanceLogger
  public Report getReport() throws InterruptedException {
    System.out.println("Fetching report...");
    Thread.sleep(TimeUnit.SECONDS.toMillis(3));
    System.out.println("Report created...");

    return new Report();
  }
}
