package br.com.fuctura.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class MainServlet extends HttpServlet{

	/**
	 * Auto generated serial.
	 */
	private static final long serialVersionUID = 4623530703015609737L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp){
		try{
			resp.sendRedirect("produtos");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
