package com.sample.writer;

import com.sample.ds.FinancialMonthlySummary;
import com.sample.ds.FinancialQuarterSummary;
import com.sample.ds.FinancialYearSummary;

public class MockFinancialReportWriter implements FinancialReportWriter{

  public void appendFreeText(String title) {
    System.out.println("Mock: appendFreeText "+title);
  }

  public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
    System.out.println("Mock: appendFinancialYearSummary");
  }

  public void appendFinancialQuarterlySummary(FinancialQuarterSummary financialQuarterSummary) {
    System.out.println("Mock: appendFinancialQuarterlySummary");
  }

  public void appendFinancialMonthlySummary(FinancialMonthlySummary financialMonthlySummary) {
    System.out.println("Mock: appendFinancialQuarterlySummary");
  }
}
