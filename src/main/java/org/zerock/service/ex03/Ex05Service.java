package org.zerock.service.ex03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.ex02.BoardDto;
import org.zerock.mapper.ex03.Ex03Mapper;

@Service
public class Ex05Service {
	
	@Autowired
	private Ex03Mapper mapper;

	public String getCustomerNameById(int id) {
		
		return mapper.selectCustomerNameById(id);
	}

	public String getEmployeeFirstNameById(int id) {
		
		return mapper.selectEmployeeFirstNameById(id);
	}

	public List<BoardDto> listBoard() {
		
		return mapper.selectBoard();
	}

	
}
