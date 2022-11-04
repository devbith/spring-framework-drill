package com.sample.dao;

import com.sample.ds.FinancialMonthlySummary;
import com.sample.ds.FinancialQuarterSummary;
import com.sample.ds.FinancialYearSummary;

public interface FinancialDataDao {

  FinancialYearSummary findFinancialYearSummary(int year);

  FinancialQuarterSummary financialQuarterSummary(int year, int quarter);

  FinancialMonthlySummary financialMonthlySummary(int year, int month);

}
