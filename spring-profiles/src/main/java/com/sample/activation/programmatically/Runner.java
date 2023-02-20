package com.sample.activation.programmatically;

import com.sample.activation.programmatically.dao.FinancialDataDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.registerShutdownHook();

    context.getEnvironment().addActiveProfile("file");
    context.register(AppConfig.class);
    context.refresh();

    FinancialDataDao financialDataDao = context.getBean(FinancialDataDao.class);
    System.out.println(financialDataDao.getClass());
  }
}
