package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	
	
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> findEmpsByDesg(String desg) throws Exception {
			List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=null;
		EmployeeDTO dto=null;
		//b.logic
		desg=desg.toUpperCase();
		//use DAO
		listBO=dao.retriveEmpsByDesg(desg);
		//Convert ListBO to ListDTO
		listDTO=new ArrayList();
		for(EmployeeBO bo:listBO){
			dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		}
		return listDTO;
	}//method

}
