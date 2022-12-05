package com.sample;

import com.sample.service.EmployeeSalaryReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class EmployeeSalaryReportServiceTest {

  @Autowired
  public EmployeeSalaryReportService employeeSalaryReportService;

  @Test
  public void shouldGenerateReport() {
    employeeSalaryReportService.generateReport();
    // assert something here
  }


}
