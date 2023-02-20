package com.sample.definitions.bean_method_level.writer;

import com.sample.definitions.bean_method_level.ds.FinancialMonthlySummary;
import com.sample.definitions.bean_method_level.ds.FinancialQuarterSummary;
import com.sample.definitions.bean_method_level.ds.FinancialYearSummary;

public class FileStoreFinancialReportWriter implements FinancialReportWriter {

  @Override
  public void appendFreeText(String text) {
    System.out.println("FileStoreFinancialReportWriter.appendFreeText");
    System.out.println(text);
  }

  @Override
  public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
    System.out.println("FileStoreFinancialReportWriter.appendFinancialYearSummary");
  }

  @Override
  public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {

  }

  @Override
  public void appendFinancialMonthlySummary(FinancialMonthlySummary financialMonthlySummary) {

  }
}
