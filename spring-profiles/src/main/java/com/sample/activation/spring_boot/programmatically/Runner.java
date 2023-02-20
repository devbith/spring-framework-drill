package com.sample.activation.spring_boot.programmatically;

import com.sample.activation.spring_boot.programmatically.dao.FinancialDataDao;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Runner {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(Runner.class)
        .profiles("database")
        .run(args);

    FinancialDataDao financialDataDao = context.getBean(FinancialDataDao.class);
    System.out.println(financialDataDao.getClass());

  }

}
