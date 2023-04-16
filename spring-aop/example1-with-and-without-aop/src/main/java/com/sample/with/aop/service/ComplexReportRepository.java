package com.sample.with.aop.service;

import com.sample.with.aop.annotations.PerformanceLogger;
import com.sample.with.aop.dto.Report;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;

@Service
public class ComplexReportRepository {

  @PerformanceLogger
  public void save(Report report) throws InterruptedException {
    System.out.println("Saving the report...");
    Thread.sleep(TimeUnit.SECONDS.toMillis(2));
    System.out.println("Report saved");
  }


}
