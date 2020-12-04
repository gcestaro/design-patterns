package com.github.gcestaro.state;

import java.util.Objects;

public class Product {

	private String name;

	private String barCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.barCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Product)) {
			return false;
		}

		Product other = (Product) obj;
		return Objects.equals(this.name, other.name)
				&& Objects.equals(this.barCode, other.barCode);
	}
}
