<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	<h1>Customer Profile</h1>
	<!--  <form action="register" method="post"> -->
		<table>
			<tr>
				<td><label>First Name : ${customerProfile.firstName}</label></td>
				<!--  <td><input type = "text" name = "firstName"></td>-->
				
			</tr>
			
			
			<tr>
				<td><label>Last Name : ${customerProfile.lastName}</label></td>
				<!--<td><input type = "text" name = "lastName"></td>-->
				
			</tr>
			
			<tr>
				<td><label>Email : ${customerProfile.email}</label></td>
				<!--<td><input type = "text" name = "email"></td>-->
			</tr>
			
			<tr>
				<td><label>Phone : ${customerProfile.phone}</label></td>
				<!--<td><input type = "text" name = "phone"></td>-->
			</tr>
			
			<tr>
				<td><label>Gender : ${customerProfile.gender}</label></td>
				<!--<td>  <input type="radio" name="gender" value="m"> Male 
  					  <input type="radio" name="gender" value="f"> Female 
  					  <input type="radio" name="gender" value="o"> Other</td>-->
			</tr>
			<tr>
				<td><label>Address 1  : ${customerProfile.address1}</label></td>
				<!--<td><input type = "text" name = "address1"></td>-->
			</tr>
			<tr>
				<td><label>Address 2  : ${customerProfile.address2}</label></td>
				<!--<td><input type = "text" name = "address2"></td>-->
			</tr>
			<tr>
				<td><label>City : ${customerProfile.city}</label></td>
				<!--<td><input type = "text" name = "city"></td>-->
			</tr>
			<tr>
				<td><label>State : ${customerProfile.state} </label></td>
				<!-- <td>
				<select name = "state">
  					<option value="VA">Virginia</option>
  					<option value="DE">Delaware</option>
  					<option value="NJ">New Jersey</option>
  					<option value="NY">New York</option>
				</select>
				</td>-->
			</tr>
			
			<tr>
				<td><label>User ID : ${userId}</label></td>
				<!--<td><input type = "text" name = "userId"></td>-->
			</tr>
			
			<!--<tr>
				<td><label>Password : </label></td>
				<td><input type = "password" name = "password"></td>
			</tr>-->
			
			<tr>
				<td><input type="submit" value = "Add Vehicle"></td>
				<td><input type="submit" value="Add Driver"></td>
			</tr>
		</table>
	<!-- </form> -->
  	
</div>

</body>
</html>
