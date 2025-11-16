package com.nhom2.multilang.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productcategory")
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productCategoryId;
	private boolean canBeShipped;
	private int isDeleted = 0;

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public ProductCategory() {
	}

	public ProductCategory(boolean canBeShipped) {
		this.canBeShipped = canBeShipped;
	}

	public ProductCategory(int productCategoryId, boolean canBeShipped) {
		this.productCategoryId = productCategoryId;
		this.canBeShipped = canBeShipped;
	}

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public boolean isCanBeShipped() {
		return canBeShipped;
	}

	public void setCanBeShipped(boolean canBeShipped) {
		this.canBeShipped = canBeShipped;
	}
}
