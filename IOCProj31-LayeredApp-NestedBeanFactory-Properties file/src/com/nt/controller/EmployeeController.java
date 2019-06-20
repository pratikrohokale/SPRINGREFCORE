package com.nt.controller;

import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class EmployeeController {
   	private EmployeeService service;
	
	   public void setService(EmployeeService service) {
			this.service = service;
		}
	   
	   public List<EmployeeDTO> processRequest(String desg)throws Exception{
		   List<EmployeeDTO> listDTO=null;
		   //use Service
		   listDTO=service.findEmpsByDesg(desg);
		   return listDTO;
	   }
}
