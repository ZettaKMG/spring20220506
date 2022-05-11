package org.zerock.service.ex01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.controller.ex03.Customer;

@Service
public class Ex03Service {

	@Autowired
	private Ex01Dao dao;
	
	public Customer getCustomer(int id) {
		dao.selectCustomer(id);
		
		return null;
	}
}
