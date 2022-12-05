package com.sample.entity;

import java.math.BigDecimal;

public record Employee(long id, String name, EmployeeSalary employeeSalary) {

  public Employee(long id, String name) {
    this(id, name, null);
  }

  public record EmployeeSalary(long  employeeId, BigDecimal amount) { }

}
