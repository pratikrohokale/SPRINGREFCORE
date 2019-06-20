package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.StudentEmployeeDAO;

public  abstract class StudentEmployeeService {
	private StudentEmployeeDAO dao;
	
	 public void setDao(StudentEmployeeDAO dao) {
		this.dao = dao;
	}
	  // In support with LMI(Lookup Method Injection)
	 public  abstract StudentBO getStudentBO();
	 public  abstract EmployeeBO getEmployeeBO();
	
	public void  registerStudent(int no,String name, String course){
		 StudentBO bo=null;
		//get StudentBO obj
		 bo=getStudentBO();
		 bo.setNo(no); bo.setName(name); bo.setCourse(course);
		 System.out.println("registring  student details....");
		//use DAO
		 dao.insertStudent(bo);
	}
	
	public void  registerEmployee(int no,String name, String company){
		 EmployeeBO bo=null;
		//get StudentBO obj
		 bo=getEmployeeBO();
		 bo.setNo(no); bo.setName(name); bo.setCompany(company);
		 System.out.println("registring  Employee details....");
		//use DAO
		 dao.insertEmployee(bo);
	}


}
