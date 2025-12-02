package com.example.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
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
		String id=request.getParameter("empId");
		String name=request.getParameter("empName");
		String design=request.getParameter("empDesign");
		String addr=request.getParameter("empAddr");
		Employee e=new Employee();
		e.setId(id);
		e.setEname(name);
		e.setDesignation(design);
		e.setAddress(addr);
		int status=EmployeeDao.add(e);
		if(status > 0)
		{
			pw.println("Employee Record added");
		}
		else
		{
			pw.println("Unable to add a record");
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
