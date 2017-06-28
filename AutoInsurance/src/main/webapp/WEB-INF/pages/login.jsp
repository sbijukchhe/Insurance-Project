<html>
<head>
<%@ page isELIgnored="false" %>
	<title>Auto Insurance Inc</title>
	<link>
	<style>
	h1 {
    color: green;
    }
	#loginDiv {
		margin: auto;
    		width: 50%;
	}
	</style>
</head>
<body>

<div id="loginDiv">
	${msg}
	<h1>Login Form</h1>
	<form action="checklogin" method="post">
		<table>
			<tr>
				<td><label>User ID</label></td>
				<td><input type = "text" name = "userId"></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type = "password" name = "password"></td>
			</tr>
			<tr>
				<td><input type="submit" value = "Login"></td>
				<td><input type = "button" value = "Cancel"></td>
			</tr>
		</table>
	</form>
  	
</div>

</body>
</html>
