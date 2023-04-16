package com.sample.no.aop.service;

import com.sample.no.aop.dto.Report;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;

@Service
public class ComplexReportRepository {

  public void save(Report report) throws InterruptedException {
    System.out.println("Saving the report...");
    Thread.sleep(TimeUnit.SECONDS.toMillis(2));
    System.out.println("Report saved");
  }


}
