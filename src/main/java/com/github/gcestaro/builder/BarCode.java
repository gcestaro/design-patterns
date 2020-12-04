package com.github.gcestaro.builder;

import java.util.Objects;

public class BarCode {

	private final String code;

	public BarCode(String code) {
		this.code = Objects.requireNonNull(code, "Bar code is mandatory.");
		validate();
	}

	public String getCode() {
		return code;
	}

	private void validate() {
		if (code.length() > 13) {
			throw new IllegalStateException("Bar code can not have more than 13 characters.");
		}
	}
}
