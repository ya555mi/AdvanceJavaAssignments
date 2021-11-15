<%@page import="java.sql.*"%>
<%@ page import="Servletpage.JDBConnection"%>
<%
String partyId = request.getParameter("partyId");
%>

<html>
<head>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="CSS/inputsbox.css">
<link rel="stylesheet" type="text/css" href="CSS/table.css">


</head>
<body>
	<%
	try {
	    Connection con = JDBConnection.sqlConnection();
	    PreparedStatement st1 = con.prepareStatement(
	    "select * from party as p INNER JOIN userlogin as u ON p.partyId=u.partyId where p.partyId='" + partyId
	            + "' ");
	    ResultSet resultSet = st1.executeQuery();

	    if (resultSet.next()) {
	%>
	<%@include file="Dasboard.jsp"%>
	<center>
		<div class="central-div" style="top: 10%">
			<form action="UpdateS" method="POST">

				<input type="hidden" name="page" value="register">
				<table cellpadding='10'>
					<tr>
						<td colspan="2">
							<center>
								<h2>User Update Page</h2>
							</center>
						</td>
					</tr>
					<tr>
						<td><label>PartyId</label></td>
						<td><input type="text" required="fill the filed"
							value="<%=resultSet.getString(1)%>" name="PartyId" class="text"
							placeholder="First Name"></td>
					</tr>
					<tr>
						<td><label>First Name</label></td>
						<td><input type="text" required="fill the filed"
							value="<%=resultSet.getString(2)%>" name="First_Name"
							class="text" placeholder="First Name"></td>
					</tr>
					<tr>
						<td><label>Last Name</label></td>
						<td><input type="text" required="fill the filed"
							value="<%=resultSet.getString(3)%>" name="Last_Name"
							class="text" placeholder="Last Name"></td>
					</tr>

					<tr>
						<td><label>Address</label></td>
						<td><input type="text" required="fill the filed"
							value="<%=resultSet.getString(4)%>" name="Address" class="text"
							placeholder="Address"></td>
					</tr>
					<tr>
						<td><label>City</label></td>
						<td><input type="text" required="fill the filed"
							value="<%=resultSet.getString(5)%>" name="City" class="text"
							placeholder="City"></td>
					</tr>

					<tr>
						<td><label>Zip</label></td>
						<td><input type="text" required="fill the filed"
							value="<%=resultSet.getString(6)%>" name="Zip" class="text"
							placeholder="State"></td>
					</tr>
					<tr>
						<td><label>State</label></td>
						<td><input type="text" required="fill the filed"
							value="<%=resultSet.getString(7)%>" name="State" class="text"
							placeholder="Zip"></td>
					</tr>
					<tr>
						<td><label>Country</label></td>
						<td><input type="text" required="fill the filed"
							value="<%=resultSet.getString(8)%>" name="Country" class="text"
							placeholder="Country"></td>
					</tr>

					<tr>
						<td><label>Phone</label></td>
						<td><input type="number" required="fill the filed"
							value="<%=resultSet.getString(9)%>" name="Phone" class="text"
							placeholder="Phone"></td>
					</tr>

					<tr>
						<td colspan="2">
							<center>
								<input type="submit" value="Update Now" class="button">
							</center>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</center>
</body>
</html>

<%
}
con.close();
} catch (SQLException sQLException) {
out.println(sQLException);
}
%>
s