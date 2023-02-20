package com.sample.definitions.component_level.writer;

import com.sample.definitions.component_level.ds.FinancialMonthlySummary;
import com.sample.definitions.component_level.ds.FinancialQuarterSummary;
import com.sample.definitions.component_level.ds.FinancialYearSummary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("database")
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
