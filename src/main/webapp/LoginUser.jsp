
<html>
<head>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!--  <link rel="stylesheet" type="text/css" href="style1.css"> -->
<link rel="stylesheet" type="text/css" href="CSS/inputsbox.css">
<link rel="stylesheet" type="text/css" href="CSS/table.css">
</head>
<body>

	<%@include file="Dasboard.jsp"%>
	<center>
		<div class="central-div" style="top: 10%">
			<h1>Welcome to Hotwax Family</h1>
			<form action="LoginUserServlet" method="POST">

				<input type="hidden" name="page" value="register">
				<table cellpadding='10'>
					<tr>
						<td colspan="2">
							<center>
								<h2>User Login Page</h2>
							</center>
						</td>
					</tr>

					<tr>
						<td><label>Email</label></td>
						<td><input type="Email" required="fill the filed"
							name="Email" class="text" placeholder="UserLoginId"></td>
					</tr>
					<tr>
						<td><label>Password</label></td>
						<td><input type="Password" required="fill the filed" value=""
							name="Password" class="text" placeholder="Password"></td>
					</tr>
					<tr>
						<td colspan="2">
							<center>
								<input type="submit" value="Login Now" class="button">
							</center>
						</td>
					</tr>
					<tr>
						<td colspan="2">

							<center>
								<a href="UserRegistration.jsp"><input type="button"
									value="Register Now" class="button"></a>
							</center>

						</td>
					</tr>
				</table>
			</form>
		</div>
	</center>
</body>
</html>