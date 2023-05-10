package com.sample.dao.util;

import com.sample.dto.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.RowCallbackHandler;

public class EmployeeRowCallBackHandler implements RowCallbackHandler {

  private final List<Employee> processedRowList = new ArrayList<>();

  @Override
  public  void processRow(ResultSet resultSet) throws SQLException {
    Employee employee = new Employee(
        resultSet.getInt("employee_id"),
        resultSet.getString("first_name"),
        resultSet.getString("last_name"),
        resultSet.getString("email"),
        resultSet.getString("phone_number"),
        resultSet.getDate("hire_date").toLocalDate(),
        resultSet.getFloat("salary")
    );
    processedRowList.add(employee);
  }

  public List<Employee> getRowList() {
    return processedRowList;
  }
}
