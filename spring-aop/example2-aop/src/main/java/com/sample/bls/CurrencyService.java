package com.sample.bls;

import com.sample.annotations.InTransaction;
import com.sample.annotations.Secured;
import com.sample.ds.CurrencyId;
import org.springframework.stereotype.Component;

@Component("currency_service")
@Secured
public class CurrencyService {
    @InTransaction
    public float getExchangeRate(String from, String to) {
        return 0f;
    }

    public float getExchangeRate(String from, String to, int multiplier) {
        return 0f;
    }

    public String getCurrencyLongName(CurrencyId currencyId) {
        return null;
    }

    public String getCurrencyCountryName(CurrencyId currencyId) {
        if (currencyId == CurrencyId.USD)
            return "USA";
        else
            throw new IllegalArgumentException("test");
    }
}
