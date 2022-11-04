package com.sample.service;

import com.sample.dao.FinancialDataDao;
import com.sample.ds.FinancialYearSummary;
import com.sample.writer.FinancialReportWriter;

public class SimpleFinancialReportService {

  private final FinancialDataDao financialDataDao;
  private final FinancialReportWriter financialReportWriter;

  public SimpleFinancialReportService(FinancialDataDao financialDataDao,
      FinancialReportWriter financialReportWriter) {
    this.financialDataDao = financialDataDao;
    this.financialReportWriter = financialReportWriter;
  }

  public void generateReport() {
    FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2022);

    financialReportWriter.appendFinancialYearSummary(financialYearSummary);
  }
}
