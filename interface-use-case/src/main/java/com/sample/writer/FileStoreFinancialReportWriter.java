package com.sample.writer;

import com.sample.ds.FinancialMonthlySummary;
import com.sample.ds.FinancialQuarterSummary;
import com.sample.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component("file-writer")
class FileStoreFinancialReportWriter implements FinancialReportWriter{

  public void appendFreeText(String title) {
    System.out.println("File writer => "+title);
  }

  public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
    System.out.println("File writer => appendFinancialYearSummary");
  }

  public void appendFinancialQuarterlySummary(FinancialQuarterSummary financialQuarterSummary) {
    System.out.println("File writer => appendFinancialQuarterlySummary");
  }

  public void appendFinancialMonthlySummary(FinancialMonthlySummary financialMonthlySummary) {
    System.out.println("File writer => appendFinancialMonthlySummary");
  }
}
