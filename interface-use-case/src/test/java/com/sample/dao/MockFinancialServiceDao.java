package com.sample.dao;

import com.sample.ds.FinancialMonthlySummary;
import com.sample.ds.FinancialQuarterSummary;
import com.sample.ds.FinancialYearSummary;

public class MockFinancialServiceDao implements FinancialDataDao {

  public FinancialYearSummary findFinancialYearSummary(int year) {
    System.out.println("Mock: DAO");
    return null;
  }

  public FinancialQuarterSummary financialQuarterSummary(int year, int quarter) {
    System.out.println("Mock: DAO");
    return null;
  }

  public FinancialMonthlySummary financialMonthlySummary(int year, int month) {
    System.out.println("Mock: DAO");
    return null;
  }
}
