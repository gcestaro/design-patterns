package com.github.gcestaro.chain;

import java.math.BigDecimal;

public interface Tax {

  BigDecimal getValue(BigDecimal amount);
}
