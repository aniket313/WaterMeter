<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="inactivecaption">
<h1 align="center">Water Bill Generation</h1>
<table align="center">
<tr><td><label>Meter Number</label></td><td><input type="text" name="meterno"></td></tr>
<tr><td><label>Readings</label></td><td><input type="text" name="readings"></td></tr>
<tr><td><label>User Name</label></td><td><input type="text" name="username"></td></tr>
<tr><td><label>Address</label></td><td><input type="text" name="address"></td></tr>
<tr><td><label>Mobile Number</label></td><td><input type="text" name="mobileno"></td></tr>
<tr><td><label>Email Id</label></td><td><input type="text" name="email"></td></tr>
<tr><td><label>Number of water Gallons</label></td><td><input type="text" name="watergallons"></td></tr>
<tr><td><label>Rate</label></td><td><input type="text" name="rate"></td></tr>
<tr><td><label>Total</label></td><td><input type="text" name="total"></td></tr>

<tr><td><input type="submit" name="uploadimagedata" value="Upload Data"></td>
<td><input type="submit" name="calculatebill" value="Calculate Bill"></td></tr>
<tr><td><input type="submit" name="emailbill" value="Email Bill"></td>
<td><input type="submit" name="smsbill" value="SMS Bill"></td></tr>




</table>
</body>
</html>