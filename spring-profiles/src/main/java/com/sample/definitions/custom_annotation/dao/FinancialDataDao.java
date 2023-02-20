package com.sample.definitions.custom_annotation.dao;

import com.sample.definitions.custom_annotation.ds.FinancialMonthlySummary;
import com.sample.definitions.custom_annotation.ds.FinancialQuarterSummary;
import com.sample.definitions.custom_annotation.ds.FinancialYearSummary;

public interface FinancialDataDao {

  FinancialYearSummary findFinancialYearSummary(int year);

  FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);

  FinancialMonthlySummary findFinancialMonthlySummary(int year, int monthly);


}
