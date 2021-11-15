
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
</head>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
<body>
	<%@include file="Dasboard.jsp"%>
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

		    int partyId = rs.getInt("partyId");
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
			<%--     <td><%=rs.getString("Full_Name") %></td>
    <td><%=rs.getString("Full_Name") %></td> --%>
		</tr>
		<%
		}

		} catch (Exception e) {
		out.println(e);
		}
		%>
	</table>
</body>
</html>