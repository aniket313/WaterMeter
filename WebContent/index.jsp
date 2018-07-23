
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="CSS/Style.css" rel="stylesheet" type="text/css"/>

</head>
<body background="admin.jpg">
<jsp:include page="header.jsp"></jsp:include>

<h1 align="center">Staff Login</h1>

<form action="WaterBillStaffLogin">
  <div class="imgcontainer">
    <img src="download.jpg" alt="Avatar" class="avatar">
  </div>

  
     <div class="container" align="center">
     <label><b>UserName</b></label>
    <input type="text" placeholder="Enter Username" name="uid" required><br>
         <label><b>Password</b></label>
    
   <input type="password" placeholder="Enter Password" name="pwd" required><br>
       
    <button type="submit">Login</button>
    <button type="button" class="cancel">Cancel</button><br>
  
   <!--   <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>-->
    <a href="#">Forget Password</a>
    
  </div>
</form>

</body>
</html>
