package com.sample.dao;

import com.sample.entity.Employee;
import com.sample.entity.Employee.EmployeeSalary;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeSalaryDao {

  @Autowired
  public EmployeeDao employeeDao;

  public List<EmployeeSalary> getEmployeeSalaryList() {
    return employeeDao.getEmployeeList()
        .stream()
        .map(Employee::employeeSalary)
        .collect(Collectors.toList());

  }
}
