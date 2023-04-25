<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration From</title>
<style type="text/css">

#main{
margin:180px;
padding:60px;
background-color:pink;
}


</style>

</head>
<body>
<form action="Register" method="post">
<div id="main">
<table align="center">

<h3 align="center"><u>Student Registration Form</u></h3>

<tr><td>User Name    :</td><td><input type="text" name="uname" placeholder="Enter User Name" required></td></tr>
<tr><td>Password     :</td><td><input type="password" name="password" placeholder="Enter password" required></td></tr>
<tr><td>Email        :</td><td><input type="text" name="email"placeholder="Enter Email ID" required></td></tr>
<tr><td>Phone Number :</td><td><input type="text" name="phone"placeholder="Enter phone number" required></td></tr>
<tr><td></td><td><input type="submit" name="register"></td></tr>

</table>
</div>
</form>
</body>
</html>
    