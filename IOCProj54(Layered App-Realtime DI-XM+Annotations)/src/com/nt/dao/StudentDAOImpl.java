package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("stDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final String  STUDENT_INSERT_QUERY="INSERT INTO SPRING_STUDENT VALUES(?,?,?,?,?)";
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
