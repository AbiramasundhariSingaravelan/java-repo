package com.example.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<a href='index.jsp'>Add New Employee</a>");
		pw.println("<h1>Employee List</h1>");
		List<Employee> empList=EmployeeDao.getAllEmployees();
		pw.println("<table border='1' class='table'>");
		pw.println("<tr><th>ID</th><th>ENAME</th><th>Designation</th><th>Address</th><th>Edit Record</th><th>Delete Record</th></tr>");
		for(Employee e:empList)
		{
			pw.println("<tr><td>"+e.getId()+"</td><td>"+e.getEname()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getAddress()+"</td><td><a href='update'>Edit</a></td><td><a href='delete'>Delete</a></td></tr>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
