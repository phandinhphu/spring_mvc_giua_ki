package com.nhom2.multilang.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "language")
public class Language {
	@Id
	private String languageID;
	private String language;
	private int isDeleted = 0;

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Language() {
	}

	public Language(String languageID, String language) {
		this.languageID = languageID;
		this.language = language;
	}

	public String getLanguageID() {
		return languageID;
	}

	public void setLanguageID(String languageID) {
		this.languageID = languageID;
	}

	public String getlanguage() {
		return language;
	}

	public void setlanguage(String language) {
		this.language = language;
	}
}
