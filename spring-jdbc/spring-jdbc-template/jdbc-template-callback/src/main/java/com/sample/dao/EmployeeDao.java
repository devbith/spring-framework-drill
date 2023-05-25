package com.sample.dao;

import com.sample.dao.util.AverageSalaryResultSetExtractor;
import com.sample.dao.util.EmployeeRowCallBackHandler;
import com.sample.dto.Employee;
import java.sql.ResultSet;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

  private JdbcTemplate jdbcTemplate = new JdbcTemplate();

  @Autowired
  public void setDataSource(DataSource dataSource) {
//    this.jdbcTemplate = new JdbcTemplate();
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }


  // Callback - RowMapper<T>
  public List<Employee> findEmployees1() {
    final String sqlQuery = "select employee_id, first_name, last_name, email, phone_number, hire_date, salary from employee;";

    final RowMapper<Employee> rowMapper = (ResultSet resultSet, int rowIndex) -> {
      return new Employee(
          resultSet.getInt("employee_id"),
          resultSet.getString("first_name"),
          resultSet.getString("last_name"),
          resultSet.getString("email"),
          resultSet.getString("phone_number"),
          resultSet.getDate("hire_date").toLocalDate(),
          resultSet.getFloat("salary")
      );
    };

    List<Employee> employeeList = jdbcTemplate.query(sqlQuery, rowMapper);
    return employeeList;
  }


  // Callback - RowCallbackHandler
  public List<Employee> findEmployees2() {
    final String sqlQuery = "select employee_id, first_name, last_name, email, phone_number, hire_date, salary from employee;";

    EmployeeRowCallBackHandler employeeRowCallBackHandler = new EmployeeRowCallBackHandler();
    jdbcTemplate.query(sqlQuery, employeeRowCallBackHandler);

    return employeeRowCallBackHandler.getRowList();
  }

  public Float findAverageSalaryRowByRow() {
   final String sqlQuery = "select salary from employee";
    AverageSalaryResultSetExtractor resultSetExtractor = new AverageSalaryResultSetExtractor();
    return jdbcTemplate.query(sqlQuery, resultSetExtractor);
  }

}
