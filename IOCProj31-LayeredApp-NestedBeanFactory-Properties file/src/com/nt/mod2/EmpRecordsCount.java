package com.nt.mod2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class EmpRecordsCount {
  private static final String  GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	public static void main(String[] args) {
		InputStream is=null;
		Properties props=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
	    try{
	    	//locate properties file
	    	is=new FileInputStream("src/com/nt/commons/jdbc.properties");
	    	//read and store properties file content to java.util.Properties obj
	    	props=new Properties();
	    	props.load(is);
	    	//load jdbc driver class
	    	Class.forName(props.getProperty("jdbc.driver"));
	    	//establish the connection
	    	con=DriverManager.getConnection(props.getProperty("jdbc.url"),
	    			                                                            props.getProperty("jdbc.user"),
	    			                                                            props.getProperty("jdbc.pwd"));
	    	//create PreparedStaetment object
	    	ps=con.prepareStatement(GET_EMP_COUNT);
	    	//execute the Query
	    	rs=ps.executeQuery();
	    	//process the ResultSet
	    	if(rs.next()){
	    		System.out.println("Records count::"+rs.getInt(1));
	    	}
	    }//try
	    catch(ClassNotFoundException cnf){
	    	cnf.printStackTrace();
	    }
	    catch(SQLException se){
	    	se.printStackTrace();
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	    finally{
	    	try{
	    	if(rs!=null)
	    		rs.close();
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    	
	      	try{
		    	if(ps!=null)
		    		ps.close();
		    	}
		    	catch(SQLException se){
		    		se.printStackTrace();
		    	}
	      	
	      	try{
		    	if(con!=null)
		    		con.close();
		    	}
		    	catch(SQLException se){
		    		se.printStackTrace();
		    	}
	      	
	      	try{
		    	if(is!=null)
		    		is.close();
		    	}
		    	catch(IOException e){
		    		e.printStackTrace();
		    	}
	    }//finally
	}//main
}//class
