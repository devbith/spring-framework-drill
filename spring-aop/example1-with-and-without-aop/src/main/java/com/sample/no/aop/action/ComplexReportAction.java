package com.sample.no.aop.action;

import com.sample.no.aop.dto.FormattedReport;
import com.sample.no.aop.dto.Report;
import com.sample.no.aop.logger.PerformanceLogger;
import com.sample.no.aop.logger.PerformanceLogger.PerformanceLoggerInfo;
import com.sample.no.aop.service.ComplexReportFormatter;
import com.sample.no.aop.service.ComplexReportProvider;
import com.sample.no.aop.service.ComplexReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexReportAction {

  @Autowired
  private ComplexReportProvider complexReportProvider;
  @Autowired
  private ComplexReportFormatter complexReportFormatter;
  @Autowired
  private ComplexReportRepository complexReportRepository;
  @Autowired
  private PerformanceLogger performanceLogger;

  public void perform() throws InterruptedException {
    PerformanceLoggerInfo performanceLoggerInfo;

    performanceLoggerInfo = performanceLogger.start("complexReportProvider.getReport()");
    Report report = complexReportProvider.getReport();
    performanceLogger.stop(performanceLoggerInfo);

    performanceLoggerInfo = performanceLogger.start("complexReportFormatter.formatReport(...)");
    FormattedReport formattedReport = complexReportFormatter.formatReport(report);
    performanceLogger.stop(performanceLoggerInfo);

    performanceLoggerInfo = performanceLogger.start("complexReportRepository.save(...)");
    complexReportRepository.save(formattedReport);
    performanceLogger.stop(performanceLoggerInfo);

    performanceLoggerInfo = performanceLogger.start("complexReportProvider.getReport()");
    report = complexReportProvider.getReport();
    performanceLogger.stop(performanceLoggerInfo);
  }
}
