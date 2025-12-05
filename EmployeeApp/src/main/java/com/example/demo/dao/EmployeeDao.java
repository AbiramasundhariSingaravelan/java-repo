package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
			status=ps.executeUpdate();//int data
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		return status;
	}
	public static List<Employee> getAllEmployees()
	{
		List<Employee> empList=new ArrayList<Employee>();
		try
		{
			Connection c=EmployeeDao.getConnection();
			PreparedStatement ps=c.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Employee e=new Employee();
				e.setId(rs.getString(1));
				e.setEname(rs.getString(2));
				e.setDesignation(rs.getString(3));
				e.setAddress(rs.getString(4));
				empList.add(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return empList;
	}
	public static Employee getEmployeeById(String id)
	{
		Employee e=new Employee();
		try
		{
			Connection c=EmployeeDao.getConnection();
			PreparedStatement ps=c.prepareStatement("select * from employee where id=?");
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				e.setId(rs.getString(1));
				e.setEname(rs.getString(2));
				e.setDesignation(rs.getString(3));
				e.setAddress(rs.getString(4));
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		return e;
		
	}
	public static int update(Employee e)
	{
		int status=0;
	
		try
		{
			Connection c=EmployeeDao.getConnection();
			PreparedStatement ps=c.prepareStatement("update employee set ename=?, designation=?,address=? where id=?");
			ps.setString(1, e.getEname());
			ps.setString(2, e.getDesignation());
			ps.setString(3, e.getAddress());
			ps.setString(4, e.getId());
			status=ps.executeUpdate();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		return status;
	}
}
