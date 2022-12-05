package com.sample.dao;

import com.sample.entity.Employee;
import com.sample.entity.Employee.EmployeeSalary;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

  private final List<Employee> employeeList;
  {
    EmployeeSalary steveSalary = new EmployeeSalary(101l, BigDecimal.valueOf(700.00));
    Employee steve = new Employee(101l, "Icaro Nazer", steveSalary);

    EmployeeSalary johnSalary = new EmployeeSalary(Long.valueOf(102l),  BigDecimal.valueOf(600.00d));
    Employee johnDoe = new Employee(101l, "John Doe", johnSalary);

    employeeList = Arrays.asList(steve, johnDoe);
  }

  public List<Employee> getEmployeeList() {
    return this.employeeList;
  }

}
