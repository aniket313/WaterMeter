package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.MyConn;
import dto.Login;

public class LoginDao {
	private MyConn mcon;

	public LoginDao() {
		
		mcon=new MyConn();
	}
	public boolean logindata(Login user)
	{
		boolean flag=false;
		try
		{
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("select * from StaffLogin where USERID=? and PASSWORD=?");
			s.setString(1, user.getUserid());
			s.setString(2, user.getPassword());
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();

		}
		
		catch(SQLException se)
		{
			se.printStackTrace();

		}
		//System.out.println(flag);
		return flag;

	}
	

}
