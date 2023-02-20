package com.sample.activation.junit.dao;

import com.sample.definitions.configuration_level.ds.FinancialMonthlySummary;
import com.sample.definitions.configuration_level.ds.FinancialQuarterSummary;
import com.sample.definitions.configuration_level.ds.FinancialYearSummary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("file")
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
