package com.sample.definitions.configuration_level;

import com.sample.definitions.configuration_level.dao.FinancialDataDao;
import com.sample.definitions.configuration_level.service.FinancialReportService;
import com.sample.definitions.configuration_level.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DatabaseApplicationConfiguration.class, FileApplicationConfiguration.class})
public class ApplicationConfiguration {

  @Bean
  public FinancialReportService financialReportService(FinancialReportWriter financialReportWriter, FinancialDataDao financialDataDao) {
    return new FinancialReportService(financialReportWriter, financialDataDao);
  }

}
