package com.sample.definitions.component_level.service;

import com.sample.definitions.component_level.dao.FinancialDataDao;
import com.sample.definitions.component_level.ds.FinancialYearSummary;
import com.sample.definitions.component_level.writer.FinancialReportWriter;
import org.springframework.stereotype.Component;

@Component
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
