package Servletpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateS")
public class UpdateS extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String PartyId=request.getParameter("PartyId");
		String FirstName=request.getParameter("First_Name");
		String LastName=request.getParameter("Last_Name");
		String Address=request.getParameter("Address");
		String City=request.getParameter("City");
		String Zip=request.getParameter("Zip");
		String State=request.getParameter("State");
		String Country=request.getParameter("Country");
		String Phone=request.getParameter("Phone");
		PrintWriter out=response.getWriter();
		try
		{
			Connection con=JDBConnection.sqlConnection();	
			String q="update party set partyId=?, firstName=?,lastName=?,address=?,city=?,zip=?,state=?,country=?,phone=? where partyId='"+PartyId+"'";
			PreparedStatement preparedStatement=con.prepareStatement(q);
			preparedStatement.setString(1,PartyId);
			preparedStatement.setString(2, FirstName);
			preparedStatement.setString(3, LastName);
			preparedStatement.setString(4, Address);
			preparedStatement.setString(5, City);
			preparedStatement.setString(6, Zip);
			preparedStatement.setString(7, State);
			preparedStatement.setString(8, Country);
			preparedStatement.setString(9, Phone);
			preparedStatement.executeUpdate();
			response.sendRedirect("UserDetails");
			out.println("Record updated successfully");
			con.close();
		}
		catch(SQLException |ClassNotFoundException sQLException)
		{
			out.println(sQLException);
		}
}}
