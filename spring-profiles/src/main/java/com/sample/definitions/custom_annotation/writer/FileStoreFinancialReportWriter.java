package com.sample.definitions.custom_annotation.writer;

import com.sample.definitions.custom_annotation.annotations.FileProfile;
import com.sample.definitions.custom_annotation.ds.FinancialMonthlySummary;
import com.sample.definitions.custom_annotation.ds.FinancialQuarterSummary;
import com.sample.definitions.custom_annotation.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component
@FileProfile
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
