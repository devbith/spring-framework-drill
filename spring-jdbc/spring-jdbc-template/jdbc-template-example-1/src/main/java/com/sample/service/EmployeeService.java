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
    String email = employeeDao.fineEmployeeEmail(1);
    System.out.println(email);

    EmployeeName employeeName = employeeDao.findEmployeeName(1);
    System.out.println(employeeName);

    printEmployeeNames();

    Map<String, Object> employee = employeeDao.findEmployeeById(1);
    System.out.println(employee);
  }

  public void printEmployeeNames() {
    List<String> employeeNames = employeeDao.findEmployeeNames();
    System.out.println(employeeNames);
  }


  public void saveEmployeeWithoutTransaction() {
    employeeDao.saveEmployee(new Employee(6, "Bishal", "Thapa", "bishalthap@gmail.com", "920336916", LocalDate.of(2023, 04, 24), 4700.00f));
  }

  @Transactional
  public void saveEmployeeWithTransaction() {
    employeeDao.saveEmployee(new Employee(7, "Bishal", "Thapa", "bishalthap@gmail.com", "920336916", LocalDate.of(2023, 04, 24), 4700.00f));
  }





}
