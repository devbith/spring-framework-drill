package com.sample.service;

import com.sample.dao.FinancialDataDao;
import com.sample.ds.FinancialYearSummary;
import com.sample.writer.FinancialReportWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportService {

  private final FinancialDataDao financialDataDao;
  private final FinancialReportWriter financialReportWriter;


  public FinancialReportService(@Qualifier("file-dao") FinancialDataDao financialDataDao,
      @Qualifier("file-writer") FinancialReportWriter financialReportWriter) {
    this.financialDataDao = financialDataDao;
    this.financialReportWriter = financialReportWriter;
  }

  public void generateReport() {
    FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2022);
    financialReportWriter.appendFinancialYearSummary(financialYearSummary);
  }

}
