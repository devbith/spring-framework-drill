package com.sample.definitions.custom_annotation.writer;

import com.sample.definitions.custom_annotation.ds.FinancialMonthlySummary;
import com.sample.definitions.custom_annotation.ds.FinancialQuarterSummary;
import com.sample.definitions.custom_annotation.ds.FinancialYearSummary;

public interface FinancialReportWriter {

  void appendFreeText(String text);

  void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);

  void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);

  void appendFinancialMonthlySummary(FinancialMonthlySummary financialMonthlySummary);

}
