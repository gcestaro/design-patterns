package com.github.gcestaro.designpatterns.proxy;

import java.math.BigDecimal;

public class Gold implements PaymentMethod {

    @Override
    public boolean pay(BigDecimal amount) {
        return true;
    }
}
