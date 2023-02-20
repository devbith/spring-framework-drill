package com.sample.definitions.custom_annotation.dao;

import com.sample.definitions.custom_annotation.annotations.FileProfile;
import com.sample.definitions.custom_annotation.ds.FinancialMonthlySummary;
import com.sample.definitions.custom_annotation.ds.FinancialQuarterSummary;
import com.sample.definitions.custom_annotation.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component
@FileProfile
public class FileStoreFinancialDataDao implements FinancialDataDao {

  @Override
  public FinancialYearSummary findFinancialYearSummary(int year) {
    System.out.println("FileStoreFinancialDataDao.findFinancialYearSummary");
    return new FinancialYearSummary();
  }

  @Override
  public FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter) {
    System.out.println("FileStoreFinancialDataDao.findFinancialQuarterSummary");
    return new FinancialQuarterSummary();
  }

  @Override
  public FinancialMonthlySummary findFinancialMonthlySummary(int year, int monthly) {
    System.out.println("FileStoreFinancialDataDao.findFinancialMonthlySummary");
    return new FinancialMonthlySummary();
  }
}
