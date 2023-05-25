package com.sample.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class DataSourceConfiguration {

  @Bean
  public DataSource dataSource() {
    System.out.println("creating datasource");
    return new JndiDataSourceLookup().getDataSource("jdbc/Database");
  }


}
