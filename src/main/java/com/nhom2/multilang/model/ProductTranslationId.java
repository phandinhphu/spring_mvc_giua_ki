package com.nhom2.multilang.model;

import java.io.Serializable;
import java.util.Objects;

public class ProductTranslationId implements Serializable {

	private int productId;
	private String languageID;

	public ProductTranslationId() {
	}

	public ProductTranslationId(int productId, String languageID) {
		this.productId = productId;
		this.languageID = languageID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ProductTranslationId))
			return false;
		ProductTranslationId that = (ProductTranslationId) o;
		return productId == that.productId && Objects.equals(languageID, that.languageID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, languageID);
	}
}
