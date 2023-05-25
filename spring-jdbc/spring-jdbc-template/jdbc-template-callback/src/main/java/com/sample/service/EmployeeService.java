package com.sample.service;

import com.sample.dao.EmployeeDao;
import com.sample.dto.Employee;
import com.sample.dto.EmployeeName;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

  private EmployeeDao employeeDao;

  @Autowired
  public EmployeeService(EmployeeDao employeeDao) {
    this.employeeDao = employeeDao;
  }

  public void printReport() {
//    System.out.println("Employee Report Start");

    System.out.println("Employees List");
    employeeDao.findEmployees2()
        .forEach(System.out::println);

    System.out.println("Employees Average Salary Calculated Row by Row");
    System.out.println(employeeDao.findAverageSalaryRowByRow());
//
//    System.out.println("Employees Average Salary Calculated on Entire Result Set");
//    System.out.println(employeeDao.findAverageSalaryCalculatedOnEntireResultSet());
//
//    System.out.println("Employees Average Salary with streams");
//    System.out.println(employeeDao.findAverageSalaryModernImplementation());
//
//    System.out.println("Employees Average Salary sql level");
//    System.out.println(employeeDao.findAverageSalarySqlLevel());
//
//    System.out.println("Employee found based on email");
//    System.out.println(employeeDao.findEmployeeIdFromEmail("Jayvon.Grant@corp.com"));
//
//    System.out.println("Employee Report Stop");
  }






}
