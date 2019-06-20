package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String  STUDENT_INSERT_QUERY="INSERT INTO SPRING_STUDENT VALUES(?,?,?,?,?)";
	private DataSource ds;
	
	 public void setDs(DataSource ds) {
			this.ds = ds;
		}

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
		ps.setInt(1,bo.getSno());
		ps.setString(2,bo.getSname());
		ps.setInt(3,bo.getTotal());
		ps.setFloat(4,bo.getAvg());
		ps.setString(5,bo.getResult());
		//execute the Query
		result=ps.executeUpdate();
		return result;
	}//method
}//class
