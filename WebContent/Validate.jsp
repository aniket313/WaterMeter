
<%@page import="Dao.LoginDao" %>

<jsp:useBean id="user" class="dto.Login" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<% 
	LoginDao loginDao = new LoginDao();

	boolean b = loginDao.logindata(user);
	if(b){
		response.sendRedirect("StaffFunctions.jsp");
	}else{
		
		Cookie cookie = new Cookie("userid",user.getUserid());
		response.addCookie(cookie);
		response.sendRedirect("logout.jsp");
	}
%>