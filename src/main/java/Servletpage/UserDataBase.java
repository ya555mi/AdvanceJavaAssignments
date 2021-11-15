package Servletpage;
     
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserDataBase")
public class UserDataBase extends HttpServlet
{
private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=null;
		Connection connection=null;
		User user=new User();
		try
		{
			out = response.getWriter();
			out.println("<h1>data insert</h1>");
			String firstName=request.getParameter("First_Name");
			String lastName=request.getParameter("Last_Name");
			String address=request.getParameter("Address");
			String city=request.getParameter("City");
			String state=request.getParameter("State");
			String country=request.getParameter("Country");
			String zip=request.getParameter("Zip"); 
			String phone=request.getParameter("Phone");
			String userLoginId=request.getParameter("Email");
			String password=request.getParameter("Password");	
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setAddress(address);
			user.setCity(city);	
			user.setState(state);
			user.setCountry(country);
			user.setZip(zip);
			user.setPhone(phone);
			user.setUserLoginId(userLoginId);
			user.setPassword(password);			    
			String partyId=user.getRandom();
			user.setPartyId(partyId);
			out.println("<h1>data insert2</h1>");
			connection =JDBConnection.sqlConnection();
			connection.setAutoCommit(false);
			PreparedStatement preparedStatement=connection.prepareStatement("insert into party(partyId,firstName,lastName,address,city,state,country,Zip,phone) values(?,?,?,?,?,?,?,?,?)");
			PreparedStatement preparedStatement1=connection.prepareStatement("insert into userlogin(userLoginId,password,partyId) values(?,?,?)");    
			preparedStatement.setString(1,user.getPartyId()); 
			preparedStatement.setString(2,user.getFirstName());
			preparedStatement.setString(3,user.getLastName());
			preparedStatement.setString(4,user.getAddress());
			preparedStatement.setString(5,user.getCity());
			preparedStatement.setString(6,user.getState());
			preparedStatement.setString(7,user.getCountry());
			preparedStatement.setString(8,user.getZip());
			preparedStatement.setString(9,user.getPhone());
			preparedStatement1.setString(1,user.getUserLoginId());
			preparedStatement1.setString(2,user.getPassword());
			preparedStatement1.setString(3,user.getPartyId());
			preparedStatement.executeUpdate();
			preparedStatement1.executeUpdate();
			out.println("<h1>data insert3</h1>");		        
			connection.commit();
			connection.close();
			HttpSession session  = request.getSession();
			session.setAttribute("authcode", user);
			response.sendRedirect("UserVerify1");				
		}
		catch(SQLException | ClassNotFoundException sQLException) 
		{
			out.println("<h1>"+sQLException+"</h1>");
}}}
