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

@WebServlet("/LoginUserServlet")
public class LoginUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<h1>Yamini</h1>");
        String First_Name = request.getParameter("First_Name");
        String Last_Name = request.getParameter("Last_Name");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = JDBConnection.sqlConnection();
            PreparedStatement st = connection.prepareStatement(
                    "select * from userlogin where userLoginId='" + First_Name + "' and password='" + Last_Name + "'");
            ResultSet rs = st.executeQuery();
            out.println("<h1>Succesfully login</h1>");
            HttpSession session = request.getSession();
            session.setAttribute("Username", rs);
            response.sendRedirect("Dasboard.jsp");
        } catch (Exception e) {
            out.println("<h1>" + e + "</h1>");
        }
    }
}