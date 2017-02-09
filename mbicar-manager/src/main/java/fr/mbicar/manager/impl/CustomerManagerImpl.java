package fr.mbicar.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mbicar.dao.CustomerDao;
import fr.mbicar.entities.Customer;
import fr.mbicar.manager.CustomerManager;

@Service
public class CustomerManagerImpl implements CustomerManager {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer addCustomer(Customer c) {
		
		return customerDao.add(c);
	}



}
