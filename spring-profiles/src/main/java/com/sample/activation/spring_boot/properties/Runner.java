package com.sample.activation.spring_boot.properties;

import com.sample.activation.spring_boot.properties.dao.FinancialDataDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Runner  {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);

    FinancialDataDao financialDao = context.getBean(FinancialDataDao.class);
    System.out.println(financialDao.getClass());
  }


}
