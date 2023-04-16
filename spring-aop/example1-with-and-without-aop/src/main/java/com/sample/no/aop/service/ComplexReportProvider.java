package com.sample.no.aop.service;

import com.sample.no.aop.dto.Report;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Component;

@Component
public class ComplexReportProvider {

  public Report getReport() throws InterruptedException {
    System.out.println("Fetching report...");
    Thread.sleep(TimeUnit.SECONDS.toMillis(3));
    System.out.println("Report created...");

    return new Report();
  }
}
