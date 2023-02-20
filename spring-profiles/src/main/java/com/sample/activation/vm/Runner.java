package com.sample.activation.vm;

import com.sample.activation.vm.dao.FinancialDataDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.registerShutdownHook();

    // profile should be activated with VM property -Dspring.profiles.active=database or -Dspring.profiles.active=file
    validateSpringProfileIsPassedAsVMOption();

    context.register(AppConfig.class);
    context.refresh();

    FinancialDataDao financialDataDao = context.getBean(FinancialDataDao.class);
    System.out.println(financialDataDao.getClass());
  }

  public static void validateSpringProfileIsPassedAsVMOption() {
    if (System.getProperty("spring.profiles.active") == null) {
      throw new RuntimeException("Specify -Dspring.profiles.active=database or -Dspring.profiles.active=file ");
    }
  }
}
