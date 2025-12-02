<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		.myForm
		{
			background-color:aqua;
		}
		.header
		{
			background-color:navy;
			border : 2px solid navy;
			padding : 20px;
		}
		h4{
			color:white;
			text-align:center;
			font-family: Cambria;
		}
	</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="header">
			<h4 style='color:white;'>Employee Management System</h4>
		</div>
		<form class="myForm" action="add" method="post">
			Employee ID: <input class="form-control" type="text" name="empId" placeholder="Enter your ID"/>
			Employee Name: <input class="form-control" type="text" name="empName" Placeholder="Enter your Name"/>
			Employee Designation <input class="form-control" type="text" name="empDesign" Placeholder="Enter your designation"/>
			Employee address: <input class="form-control" type="text" name="empAddr" Placeholder="Enter your address"/>
			<input type="Submit" value="Add"/>
		 </form>
	</div>
	<br><br>
	
</body>
</html>