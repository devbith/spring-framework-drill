package com.sample.writer;

import com.sample.ds.FinancialMonthlySummary;
import com.sample.ds.FinancialQuarterSummary;
import com.sample.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component("database-writer")
class DatabaseStoreFinancialReportWriter implements FinancialReportWriter {

  public void appendFreeText(String title) {
    System.out.println("Database writer => "+title);
  }

  public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
    System.out.println("Database writer => appendFinancialYearSummary");
  }

  public void appendFinancialQuarterlySummary(FinancialQuarterSummary financialQuarterSummary) {
    System.out.println("Database writer => appendFinancialQuarterlySummary");
  }

  public void appendFinancialMonthlySummary(FinancialMonthlySummary financialMonthlySummary) {
    System.out.println("Database writer => appendFinancialMonthlySummary");
  }
}
