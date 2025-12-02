package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.example.demo.model.Employee;

public class EmployeeDao {

	public static Connection getConnection()
	{
		Connection c=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/empapp","root","arthi");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return c;
	}
	public static  int add(Employee e)
	{
		int status=0;
		try
		{
			Connection c=EmployeeDao.getConnection();
			PreparedStatement ps=c.prepareStatement("insert into employee(id,ename,designation,address)values(?,?,?,?)");
			ps.setString(1,e.getId());
			ps.setString(2, e.getEname());
			ps.setString(3, e.getDesignation());
			ps.setString(4, e.getAddress());
			status=ps.executeUpdate();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		return status;
	}
}
