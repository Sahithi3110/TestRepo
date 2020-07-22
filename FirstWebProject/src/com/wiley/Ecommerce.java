package com.wiley;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.* 
;/**
 * Servlet implementation class Ecommerce
 */
@WebServlet("/Ecommerce")
public class Ecommerce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ecommerce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String Electronics=request.getParameter("electronics");
		String Grocery=request.getParameter("grocery");
		String clothes=request.getParameter("cloths");
		//response.setContentType("text/html");
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","reddy","sahithi");  
	
			PreparedStatement ps=con.prepareStatement("insert into Ecommerce values(?,?,?)");
			ps.setString(1, Electronics);
			ps.setString(2,Grocery);
			ps.setString(3,clothes );
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
	
	}
}
