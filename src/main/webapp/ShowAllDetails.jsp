<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     --%>


<%@page import="javax.servlet.http.HttpSession"%>
<%@page import=" java.sql.ResultSet"%>


<%
ResultSet rs = null;
HttpSession session1 = null;

try {
    session1 = request.getSession();
    rs = (ResultSet) session1.getAttribute("Username");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page here</title>
<link rel="stylesheet" type="text/css" href="CSS/inputsbox.css">
<link rel="stylesheet" type="text/css" href="CSS/table.css">

</head>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
<%@include file="Dasboard.jsp"%>
<body>
	<table style="width: 50%">
		<tr>
			<th>First_Name</th>
			<th>Last_Name</th>
			<th>Address</th>
			<th>City</th>
			<th>zip</th>
			<th>state</th>
			<th>country</th>
			<th>phone</th>
			<th>UserLoginId</th>

		</tr>

		<%
		while (rs.next()) {

		    String partyId = rs.getString("partyId");
		%>

		<tr>
			<td><%=rs.getString("firstName")%></td>
			<td><%=rs.getString("lastName")%></td>
			<td><%=rs.getString("address")%></td>
			<td><%=rs.getString("city")%></td>
			<td><%=rs.getString("state")%></td>
			<td><%=rs.getString("zip")%></td>
			<td><%=rs.getString("country")%></td>
			<td><%=rs.getString("phone")%></td>
			<td><%=rs.getString("userLoginId")%></td>
			<td><button type="button" class="  btn-primary" name="button">
					<a style="color: blue"
						href="UserUpdate1.jsp?partyId=<%=partyId%>">UPDATE</a>
				</button></td>
			<td><button type="button" class=" btn-danger">
					<a style="color: Red" href="DeleteInfo.jsp?partyId=<%=partyId%>">DELETE</a>
				</button></td>
			<%
			}

			} catch (Exception e) {
			out.println(e);
			}
			%>
		
	</table>
</body>
</html>