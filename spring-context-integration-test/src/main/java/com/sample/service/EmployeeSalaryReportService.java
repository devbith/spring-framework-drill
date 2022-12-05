package com.sample.service;

import com.sample.dao.EmployeeSalaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeSalaryReportService {

  @Autowired
  private EmployeeSalaryDao employeeSalaryDao;

  public void generateReport() {
    System.out.println("Generating salary report");
    employeeSalaryDao.getEmployeeSalaryList().forEach(employeeSalary -> {
      System.out.println(employeeSalary);
    });

  }

}
