package com.sample.dao;

import com.sample.ds.FinancialMonthlySummary;
import com.sample.ds.FinancialQuarterSummary;
import com.sample.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component("database-dao")
class DatabaseStoreFinancialDataDao implements FinancialDataDao{

  public FinancialYearSummary findFinancialYearSummary(int year) {
    System.out.println("Database Dao => findFinancialYearSummary");
    return new FinancialYearSummary();
  }

  public FinancialQuarterSummary financialQuarterSummary(int year, int quarter) {
    System.out.println("Database Dao => financialQuarterSummary");
    return new FinancialQuarterSummary();
  }

  public FinancialMonthlySummary financialMonthlySummary(int year, int month) {
    System.out.println("Database Dao => financialMonthlySummary");
    return new FinancialMonthlySummary();
  }
}
