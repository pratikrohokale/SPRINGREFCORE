package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("stDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final String  STUDENT_INSERT_QUERY="INSERT INTO SPRING_STUDENT(SNAME,TOTAL,AVG,RESULT) VALUES(?,?,?,?)";
	@Autowired
	private DataSource ds;
	

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
	   //get jdbc con object from JDBC con pool using DataSource object
		con=ds.getConnection();
		//create PrpearedStatement object
		ps=con.prepareStatement(STUDENT_INSERT_QUERY);
		//set values to query params
		//ps.setInt(1,bo.getSno());
		ps.setString(1,bo.getSname());
		ps.setInt(2,bo.getTotal());
		ps.setFloat(3,bo.getAvg());
		ps.setString(4,bo.getResult());
		//execute the Query
		result=ps.executeUpdate();
		System.out.println("DAO:::"+ds.getClass());
		return result;
	}//method
}//class
