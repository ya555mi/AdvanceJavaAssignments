package Servletpage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserVerify1")
public class UserVerify1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session=null;
		try (PrintWriter out = response.getWriter())
		{
			out.println("user");	
			session = request.getSession();
			User user= (User) session.getAttribute("authcode"); 
			//create instance object of the SendEmail Class
			SendEmail sm = new SendEmail();
			//call the send email method
			boolean test = sm.sendEmail(user);
			//check if the email send successfully
			if(test)
			{
				session  = request.getSession();
				session.setAttribute("authcode", user);
				response.sendRedirect("LoginUser.jsp");
			}else
			{
				out.println("Failed to send verification email");
			}
		}
	}
   
//    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response); }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
	}
}