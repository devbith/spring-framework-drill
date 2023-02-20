package com.sample.definitions.bean_method_level.service;

import com.sample.definitions.bean_method_level.dao.FinancialDataDao;
import com.sample.definitions.bean_method_level.ds.FinancialYearSummary;
import com.sample.definitions.bean_method_level.writer.FinancialReportWriter;

public class FinancialReportService {

  private FinancialReportWriter financialReportWriter;
  private FinancialDataDao financialDataDao;

  public FinancialReportService(FinancialReportWriter financialReportWriter, FinancialDataDao financialDataDao) {
    this.financialReportWriter = financialReportWriter;
    this.financialDataDao = financialDataDao;
  }

  public void generateReport() {
    FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2023);
    financialReportWriter.appendFinancialYearSummary(financialYearSummary);

  }
}
