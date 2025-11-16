package com.nhom2.multilang.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "productcategorytranslation")
@IdClass(ProductCategoryTranslationId.class)
public class ProductCategoryTranslation {
	@Id
	private int productCategoryID;
	@Id
	private String languageID;
	private String categoryName;
	private int isDeleted = 0;

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public ProductCategoryTranslation() {
	}

	public ProductCategoryTranslation(int productCategoryID, String languageID, String categoryName) {
		this.productCategoryID = productCategoryID;
		this.languageID = languageID;
		this.categoryName = categoryName;
	}

	public int getProductCategoryID() {
		return productCategoryID;
	}

	public void setProductCategoryID(int productCategoryID) {
		this.productCategoryID = productCategoryID;
	}

	public String getLanguageID() {
		return languageID;
	}

	public void setLanguageID(String languageID) {
		this.languageID = languageID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
