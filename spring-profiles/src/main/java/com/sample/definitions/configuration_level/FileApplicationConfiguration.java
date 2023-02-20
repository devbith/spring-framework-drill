package com.sample.definitions.configuration_level;

import com.sample.definitions.configuration_level.dao.FileStoreFinancialDataDao;
import com.sample.definitions.configuration_level.dao.FinancialDataDao;
import com.sample.definitions.configuration_level.writer.FileStoreFinancialReportWriter;
import com.sample.definitions.configuration_level.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("file")
public class FileApplicationConfiguration {

  @Bean
  public FinancialDataDao financialDataDao() {
    return new FileStoreFinancialDataDao();
  }

  @Bean
  public FinancialReportWriter financialReportWriter() {
    return new FileStoreFinancialReportWriter();
  }

}