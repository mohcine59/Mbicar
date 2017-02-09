package fr.mbicar.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import fr.mbicar.dao.AbstractDao;

@Transactional
public abstract class AbstractDaoImpl implements AbstractDao {

	/**
	 * Le contexte de persistance permettant l'acc�s aux donn�es
	 */
	@PersistenceContext(unitName = "persistMbicar")
	EntityManager em;

	@Override
	public <T> T add(final T t) {
		this.em.persist(t);
		this.em.flush();

		return t;
	}

	@Override
	public <T> T update(final T t) {
		T res = null;
		res = this.em.merge(t);
		this.em.flush();
		return res;

	}
}
