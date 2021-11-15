
<html>
<head>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="CSS/inputsbox.css">
<link rel="stylesheet" type="text/css" href="CSS/table.css">

</head>
<body>

	<%@include file="Dasboard.jsp"%>
	<center>
		<div class="central-div" style="top: 10%">
			<form action="UserDataBase" method="POST">

				<input type="hidden" name="page" value="register">
				<table cellpadding='10'>
					<tr>
						<td colspan="2">
							<center>
								<h2>User Registration Page</h2>
							</center>
						</td>
					</tr>
					<tr>
						<td><label>First Name</label></td>
						<td><input type="text" required="fill the filed"
							name="First_Name" class="text" placeholder="First Name">
						</td>
					</tr>
					<tr>
						<td><label>Last Name</label></td>
						<td><input type="text" required="fill the filed"
							name="Last_Name" class="text" placeholder="Last Name"></td>
					</tr>

					<tr>
						<td><label>Address</label></td>
						<td><input type="text" required="fill the filed"
							name="Address" class="text" placeholder="Address"></td>
					</tr>
					<tr>
						<td><label>City</label></td>
						<td><input type="text" required="fill the filed" name="City"
							class="text" placeholder="City"></td>
					</tr>

					<tr>
						<td><label>State</label></td>
						<td><input type="text" required="fill the filed" name="State"
							class="text" placeholder="State"></td>
					</tr>
					<tr>
						<td><label>Country</label></td>
						<td><input type="text" required="fill the filed"
							name='Country' class="text" placeholder="Country"></td>
					</tr>
					<tr>
						<td><label>Zip</label></td>
						<td><input type="number" required="fill the filed" name="Zip"
							class="text" placeholder="Zip"></td>
					</tr>
					<tr>
						<td><label>Phone</label></td>
						<td><input type="number" required="fill the filed"
							name="Phone" class="text" placeholder="Phone"></td>
					</tr>
					<tr>
						<td><label>Email</label></td>
						<td><input type="Email" required="fill the filed"
							name="Email" class="text" placeholder="Email"></td>
					</tr>
					<tr>
						<td><label>Password</label></td>
						<td><input type="Password" required="fill the filed" value=""
							name="Password" class="text" placeholder="Password"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Register Now"
							class="button"></td>
					</tr>
				</table>
			</form>
		</div>
	</center>
</body>
</html>