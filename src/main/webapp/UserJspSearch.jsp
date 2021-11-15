<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search User</title>
<link rel="stylesheet" type="text/css" href="CSS/inputsbox.css">
<link rel="stylesheet" type="text/css" href="CSS/table.css">
</head>
<body>
	<%@include file="Dasboard.jsp"%>
	<center>

		<div class="regform">
			<h1>Search User</h1>
		</div>
		<div class="main">

			<form action="SearchUser" method="POST">
				<div id="name">
					<table cellpadding='10'>
						<tr>
							<td><input type="text" required="fill the filed" class=""
								name="First_Name" placeholder="Enter First_Name "></td>
							<td><input type="text" required="fill the filed" class=""
								name="Last_Name" placeholder="Enter Last_Name "></td>
							</div>
						</tr>
						<center>
							<tr>
								<td colspan="2"><button type="submit" class="button">Search</button></td>
							</tr>
						</center>
					</table>
			</form>
		</div>
	</center>
</body>
</html>

<html>