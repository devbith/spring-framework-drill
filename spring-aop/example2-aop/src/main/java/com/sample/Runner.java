package com.sample;

import com.sample.bls.AlternativeCurrenciesRepository;
import com.sample.bls.CurrenciesRepository;
import com.sample.bls.CurrencyService;
import com.sample.ds.CurrencyId;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {


  public static void main(String[] args) throws InterruptedException {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    context.registerShutdownHook();

    CurrencyService currencyService = context.getBean(CurrencyService.class);
    CurrenciesRepository currenciesRepository = context.getBean(CurrenciesRepository.class);
    AlternativeCurrenciesRepository alternativeCurrenciesRepository = context.getBean(AlternativeCurrenciesRepository.class);

    currencyService.getExchangeRate("EUR", "USD");
    currencyService.getExchangeRate("EUR", "USD", 100);
    currencyService.getCurrencyLongName(CurrencyId.EUR);
    try {
      currencyService.getCurrencyCountryName(CurrencyId.EUR);
    } catch (Exception e) {
      // ignored on purpose
    }
    currencyService.getCurrencyCountryName(CurrencyId.USD);
    currenciesRepository.getCurrenciesCount();
    alternativeCurrenciesRepository.getCurrenciesCount();
  }
}
