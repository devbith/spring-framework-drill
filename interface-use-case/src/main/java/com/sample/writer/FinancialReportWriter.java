package com.sample.writer;

import com.sample.ds.FinancialMonthlySummary;
import com.sample.ds.FinancialQuarterSummary;
import com.sample.ds.FinancialYearSummary;

public interface FinancialReportWriter {

  void appendFreeText(String title);

  void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);

  void appendFinancialQuarterlySummary(FinancialQuarterSummary financialQuarterSummary);

  void appendFinancialMonthlySummary(FinancialMonthlySummary financialMonthlySummary);

}
