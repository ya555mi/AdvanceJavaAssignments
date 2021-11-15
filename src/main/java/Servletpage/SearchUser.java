package Servletpage;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SearchUser")
public class SearchUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	out.println("<h1>Yamini</h1>");
	String s1=request.getParameter("First_Name");
	String s2=request.getParameter("Last_Name");
try
{
	Connection con=JDBConnection.sqlConnection();		                	  
	PreparedStatement st=con.prepareStatement("select * from party as p inner join userlogin as u on p.partyId=u.partyId where p.firstName='"+s1+"' and p.lastName='"+s2+"'");
	ResultSet rs=st.executeQuery();
	HttpSession session=request.getSession();
	session.setAttribute("Username", rs);
	response.sendRedirect("UserSearchDetails.jsp");
}	
catch(Exception e)
{
	out.println("<h1>"+e+"</h1>");		                  }
}	
}
 