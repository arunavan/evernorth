package com.evernorth.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp {

	public static void main(String[] args) throws Exception{
	//step1	
	Class.forName("com.mysql.cj.jdbc.Driver");
	//step 2
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/evernorth","root","root");
	//	System.out.println(" connection is success");
		//step3 
		Statement st=con.createStatement();
		
	//	st.executeUpdate("create table hospital(id int primary key ,name varchar(20)) ");
	//	System.out.println(" table created ");
		st.execute("insert into hospital values(51,'Medicover')");
		st.execute("insert into hospital values(6,'Medicover78')");
		st.execute("insert into hospital values(7,'Medicover56')");
	//	st.executeUpdate("update hospital set name='AIG' where id=2");
	//	st.executeUpdate("delete from  hospital where id=3");
		System.out.println("inserted...");
		
		ResultSet rs=st.executeQuery("select * from hospital");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"  "+rs.getString(2));
		}
		
		
		

	}

}
