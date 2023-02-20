package com.sample.activation.junit;

import com.sample.activation.junit.dao.FinancialDataDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@ActiveProfiles("file")
public class AppConfigTest {

  @Autowired
  private FinancialDataDao financialDataDao;

  @Test
  public void shouldTestFinancialDao() {
    System.out.println("Instance of FinancialDataDao is: "+financialDataDao.getClass());
  }
}
