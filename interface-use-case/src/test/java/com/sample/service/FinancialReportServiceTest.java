package com.sample.service;

import com.sample.dao.MockFinancialServiceDao;
import com.sample.writer.MockFinancialReportWriter;
import org.junit.Test;

public class FinancialReportServiceTest {


  @Test
  public void shouldGenerateReportOnManualMockTypes() {

    SimpleFinancialReportService simpleFinancialReportService = new SimpleFinancialReportService
        (new MockFinancialServiceDao(), new MockFinancialReportWriter());


    simpleFinancialReportService.generateReport();

  }

}
