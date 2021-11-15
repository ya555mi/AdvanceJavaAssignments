<%@page import="java.sql.*"%>
<%@ page import="Servletpage.JDBConnection"%>
<html>
<head>

<link rel="stylesheet" type="text/css" href="CSS/inputsbox.css">
<link rel="stylesheet" type="text/css" href="CSS/table.css">

<link rel="stylesheet" type="text/css" href="CSS/Style.css" />
</head>
<body>
	<%@include file="Dasboard.jsp"%>
	<center>
		<table border='1' cellpadding='12'>
			<%
			String partyId = request.getParameter("partyId");
			try {
			    Connection con = JDBConnection.sqlConnection();
			    PreparedStatement st = con.prepareStatement(
			    "delete p,u from party as p inner join userlogin as u ON p.partyId=u.partyId where p.partyId='" + partyId
			            + "'");
			    st.executeUpdate();
			    response.sendRedirect("UserDetails");
			    out.print("<tr><th colspan='5'><h1 align='center'>data deleted</h1></th></tr>");
			%>
			<%
			con.close();

			} catch (SQLException sQLException) {
			out.println(sQLException);

			}
			%>
		</table>
	</center>
</body>
</html>