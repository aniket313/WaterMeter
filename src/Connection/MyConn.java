package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
	
	private static final String DIRVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/cdac";
	private static final String USER_NAME="cdac";
	private static final String PASSWORD="cdac";
	private Connection con;
	
	public Connection getConn()throws ClassNotFoundException,SQLException 
	
	{
		if(con==null || con.isClosed()) {
			Class.forName(DIRVER_CLASS);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}
		return con;
	}
	


}
