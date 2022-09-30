package com.github.gcestaro.designpatterns.proxy;

import java.math.BigDecimal;

public interface PaymentMethod {

    boolean pay(BigDecimal amount);
}
