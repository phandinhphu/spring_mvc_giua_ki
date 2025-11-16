package com.nhom2.multilang.dao.mysql;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nhom2.multilang.dao.LanguageDAO;
import com.nhom2.multilang.model.Language;

@Repository
@Transactional
public class MySqlLanguageDAO implements LanguageDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Language> getAllLanguages() {
		return sessionFactory.getCurrentSession().createQuery("FROM Language WHERE isDeleted = 0", Language.class)
				.getResultList();
	}

	@Override
	public Language getLanguageById(String languageID) {
		return sessionFactory.getCurrentSession().get(Language.class, languageID);
	}

	@Override
	public void addLanguage(Language language) {
		sessionFactory.getCurrentSession().save(language);
	}

	@Override
	public void updateLanguage(Language language) {
		sessionFactory.getCurrentSession().update(language);
	}

	@Override
	public void deleteLanguage(String languageID) {
		Language language = getLanguageById(languageID);
		if (language != null) {
			language.setIsDeleted(1);
			sessionFactory.getCurrentSession().update(language);
		}
	}
}
