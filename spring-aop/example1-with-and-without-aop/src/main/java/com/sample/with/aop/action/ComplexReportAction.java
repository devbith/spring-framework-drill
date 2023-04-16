package com.sample.with.aop.action;

import com.sample.with.aop.dto.FormattedReport;
import com.sample.with.aop.dto.Report;
import com.sample.with.aop.service.ComplexReportFormatter;
import com.sample.with.aop.service.ComplexReportProvider;
import com.sample.with.aop.service.ComplexReportRepository;
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

  public void perform() throws InterruptedException {
    Report report = complexReportProvider.getReport();
    FormattedReport formattedReport = complexReportFormatter.formatReport(report);
    complexReportRepository.save(formattedReport);

    report = complexReportProvider.getReport();
  }
}
