package com.sample.activation.spring_boot.properties.dao;

import com.sample.definitions.configuration_level.ds.FinancialMonthlySummary;
import com.sample.definitions.configuration_level.ds.FinancialQuarterSummary;
import com.sample.definitions.configuration_level.ds.FinancialYearSummary;

public interface FinancialDataDao {

  FinancialYearSummary findFinancialYearSummary(int year);

  FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);

  FinancialMonthlySummary findFinancialMonthlySummary(int year, int monthly);


}
