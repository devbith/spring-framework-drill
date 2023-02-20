package com.sample.definitions.component_level.writer;

import com.sample.definitions.component_level.ds.FinancialMonthlySummary;
import com.sample.definitions.component_level.ds.FinancialQuarterSummary;
import com.sample.definitions.component_level.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

public interface FinancialReportWriter {

  void appendFreeText(String text);

  void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);

  void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);

  void appendFinancialMonthlySummary(FinancialMonthlySummary financialMonthlySummary);

}
