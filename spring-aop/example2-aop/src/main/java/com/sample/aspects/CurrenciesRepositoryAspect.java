package com.sample.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CurrenciesRepositoryAspect {
    @Before("this(com.sample.bls.CurrenciesRepositoryImpl)")
    public void beforeThisCurrenciesRepository() {
        System.out.println("Before - this(CurrenciesRepositoryImpl)");
    }

    @Before("target(com.sample.bls.CurrenciesRepositoryImpl)")
    public void beforeTargetCurrenciesRepository() {
        System.out.println("Before - target(CurrenciesRepositoryImpl)");
    }
}
