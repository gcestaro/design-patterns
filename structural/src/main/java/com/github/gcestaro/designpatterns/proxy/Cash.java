package com.github.gcestaro.designpatterns.proxy;

import java.math.BigDecimal;

public class Cash implements PaymentMethod {

    @Override
    public boolean pay(BigDecimal amount) {
        return false;
    }
}
