package com.nhom2.multilang.model;

import java.io.Serializable;
import java.util.Objects;

public class ProductCategoryTranslationId implements Serializable {

	private int productCategoryID;
	private String languageID;

	public ProductCategoryTranslationId() {
	}

	public ProductCategoryTranslationId(int productCategoryID, String languageID) {
		this.productCategoryID = productCategoryID;
		this.languageID = languageID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ProductCategoryTranslationId))
			return false;
		ProductCategoryTranslationId that = (ProductCategoryTranslationId) o;
		return productCategoryID == that.productCategoryID && Objects.equals(languageID, that.languageID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(productCategoryID, languageID);
	}
}
