package com.sample.dao;

import com.sample.aspect.LogInvokedMethodName;
import com.sample.dto.Employee;
import com.sample.dto.EmployeeName;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@LogInvokedMethodName
public class EmployeeDao {

  private JdbcTemplate jdbcTemplate = new JdbcTemplate();

  @Autowired
  public void setDataSource(DataSource dataSource) {
//    this.jdbcTemplate = new JdbcTemplate();
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public String fineEmployeeEmail(int id) {
    return jdbcTemplate.queryForObject("select email from employee where employee_id = ?",
        new Object[]{id}, String.class);
  }

  public EmployeeName findEmployeeName(int id) {
    return jdbcTemplate.queryForObject("select first_name, last_name from employee where employee_id = ?",
        new Object[]{id}, (resultSet, rowNum) -> new EmployeeName(resultSet.getString("first_name"), resultSet.getString("last_name")));
  }

  public List<String> findEmployeeNames() {
    return jdbcTemplate.queryForList("select first_name from employee", String.class);
  }

  public Map<String, Object> findEmployeeById(int id) {
    return jdbcTemplate.queryForMap("select * from employee where employee_id = ?", new Object[]{id});
  }

  public void saveEmployee(final Employee employee) {
    jdbcTemplate.update(
        "insert into employee(employee_id, first_name, last_name, email, phone_number, hire_date, salary) values ( ?, ?, ?, ?, ?, ?, ? )",
        new Object[]{
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail(),
            employee.getPhoneNumber(),
            employee.getHireDate(),
            employee.getSalary()
        });
  }


}
