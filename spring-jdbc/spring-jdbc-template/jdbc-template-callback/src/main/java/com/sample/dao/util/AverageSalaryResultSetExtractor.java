package com.sample.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class AverageSalaryResultSetExtractor implements ResultSetExtractor<Float> {

  @Override
  public Float extractData(ResultSet resultSet) throws SQLException, DataAccessException {
    float salarySum = 0;
    int totalEmployee = 0;
    while (resultSet.next()) {
      float salary = resultSet.getFloat("salary");
      salarySum += salary;
      ++totalEmployee;
    }
    return salarySum / totalEmployee;
  }
}
