<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="CSS/Staff.css" rel="stylesheet" type="text/css"/>
<title>Insert title here</title>
</head>

<body bgcolor="">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="cache.jsp"></jsp:include>
<form>


<div class="container">

<!-- billgeneration -->
<a href="NewBillGeneration.jsp">
<img src="img/billgeneration.png" alt="New Bill Generation" title="New Bill Generation">
<p>New Bill Generation</p></a>

<!--New Connection Request -->

<a href="NewRequest">
<img src="img/NewConnection.jpg" alt="New Connection Request" title="New Connection Request" >
<p>New Connection Request</p></a>
<!--Pending Bills -->
<a href="PendingBill" target="_blank">
<span>
<img src="img/pending22.jpg" alt="User Pending Bills" title="User Pending Bills"></span>
<p>User Pending Bills</p>
</a>

<!--Extra Usage -->
<a href="ExtraUsage">
<img src="img/extrausage.png" alt="Extra Water Usage" title="Extra Water Usage">
<p>Extra Water Usage</p></a>

<!--Cut Connection Requests -->
<a href="CutConnection">
<img src="img/cutconnection.png" alt="Cut Connection Requests" title="Cut Connection Requests">
<p>Cut Connection Requests</p></a>

<!--logout -->
<a href="logout.jsp">
<img src="img/Logout1.jpg" alt="logout" title="logout">
<p>Logout</p></a>

</div>

</form>
</body>

</html>
