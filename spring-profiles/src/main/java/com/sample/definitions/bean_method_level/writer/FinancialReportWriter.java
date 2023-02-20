package com.sample.definitions.bean_method_level.writer;

import com.sample.definitions.bean_method_level.ds.FinancialMonthlySummary;
import com.sample.definitions.bean_method_level.ds.FinancialQuarterSummary;
import com.sample.definitions.bean_method_level.ds.FinancialYearSummary;

public interface FinancialReportWriter {

  void appendFreeText(String text);

  void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);

  void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);

  void appendFinancialMonthlySummary(FinancialMonthlySummary financialMonthlySummary);

}
