package com.sample.definitions.custom_annotation.writer;

import com.sample.definitions.custom_annotation.annotations.DatabaseProfile;
import com.sample.definitions.custom_annotation.ds.FinancialMonthlySummary;
import com.sample.definitions.custom_annotation.ds.FinancialQuarterSummary;
import com.sample.definitions.custom_annotation.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component
@DatabaseProfile
public class DatabaseFinancialReportWriter implements FinancialReportWriter {

  @Override
  public void appendFreeText(String text) {
    System.out.println("DatabaseFinancialReportWriter.appendFreeText");
    System.out.println(text);
  }

  @Override
  public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
    System.out.println("DatabaseFinancialReportWriter.appendFinancialYearSummary");
  }

  @Override
  public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
    System.out.println("DatabaseFinancialReportWriter.appendFinancialQuarterSummary");
  }

  @Override
  public void appendFinancialMonthlySummary(FinancialMonthlySummary financialMonthlySummary) {
    System.out.println("DatabaseFinancialReportWriter.appendFinancialMonthlySummary");
  }
}
