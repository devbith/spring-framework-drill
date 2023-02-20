package com.sample.definitions.bean_method_level;

import com.sample.definitions.bean_method_level.dao.DatabaseStoreFinancialDataDao;
import com.sample.definitions.bean_method_level.dao.FileStoreFinancialDataDao;
import com.sample.definitions.bean_method_level.dao.FinancialDataDao;
import com.sample.definitions.bean_method_level.service.FinancialReportService;
import com.sample.definitions.bean_method_level.writer.DatabaseFinancialReportWriter;
import com.sample.definitions.bean_method_level.writer.FileStoreFinancialReportWriter;
import com.sample.definitions.bean_method_level.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {

  @Bean
  public FinancialReportService financialReportService(FinancialReportWriter financialReportWriter, FinancialDataDao financialDataDao) {
    return new FinancialReportService(financialReportWriter, financialDataDao);
  }

  @Bean
  @Profile("database")
  public FinancialReportWriter databaseFinancialReportWriter() {
    return new DatabaseFinancialReportWriter();
  }

  @Bean
  @Profile("database")
  public FinancialDataDao databaseFinancialDataDao() {
    return new DatabaseStoreFinancialDataDao();
  }

  @Bean
  @Profile("file")
  public FinancialReportWriter fileFinancialReportWriter() {
    return new FileStoreFinancialReportWriter();
  }

  @Bean
  @Profile("file")
  public FinancialDataDao fileFinancialDataDao() {
    return new FileStoreFinancialDataDao();
  }

}
