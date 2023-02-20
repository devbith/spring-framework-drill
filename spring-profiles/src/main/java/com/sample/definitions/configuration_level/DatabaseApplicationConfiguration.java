package com.sample.definitions.configuration_level;

import com.sample.definitions.configuration_level.dao.DatabaseStoreFinancialDataDao;
import com.sample.definitions.configuration_level.dao.FinancialDataDao;
import com.sample.definitions.configuration_level.writer.DatabaseFinancialReportWriter;
import com.sample.definitions.configuration_level.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("database")
public class DatabaseApplicationConfiguration {

  @Bean
  public FinancialDataDao financialDataDao() {
    return new DatabaseStoreFinancialDataDao();
  }

  @Bean
  public FinancialReportWriter financialReportWriter() {
    return new DatabaseFinancialReportWriter();
  }

}
