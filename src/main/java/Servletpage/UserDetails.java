package Servletpage;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserDetails")
public class UserDetails extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Yamini</h1>");
		try
		{
			Connection connection=JDBConnection.sqlConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from party as p inner join userlogin as u on p.partyId=u.partyId");
			ResultSet resultSet=preparedStatement.executeQuery();
			HttpSession session=request.getSession();
			session.setAttribute("Username", resultSet);
			response.sendRedirect("ShowAllDetails.jsp");
		}	
		catch(SQLException | NullPointerException | ClassNotFoundException sQLException)
		{
			out.println("<h1>"+sQLException+"</h1>");		                  }
		}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
	
}
