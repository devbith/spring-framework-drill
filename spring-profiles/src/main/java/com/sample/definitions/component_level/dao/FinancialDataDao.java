package com.sample.definitions.component_level.dao;

import com.sample.definitions.component_level.ds.FinancialMonthlySummary;
import com.sample.definitions.component_level.ds.FinancialQuarterSummary;
import com.sample.definitions.component_level.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

public interface FinancialDataDao {

  FinancialYearSummary findFinancialYearSummary(int year);

  FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);

  FinancialMonthlySummary findFinancialMonthlySummary(int year, int monthly);


}
