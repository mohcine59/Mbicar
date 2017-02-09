package fr.mbicar.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.mbicar.dao.AbstractDao;
import fr.mbicar.dao.CompanyDao;
import fr.mbicar.dao.SaleDao;

@Repository("saleDao")
public class SaleDaoImpl extends AbstractDaoImpl implements SaleDao {


}
