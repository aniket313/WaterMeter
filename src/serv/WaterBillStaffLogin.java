package serv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WaterBillStaffLogin
 */
@WebServlet("/WaterBillStaffLogin")
public class WaterBillStaffLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WaterBillStaffLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user=request.getParameter("uid");
		String password=request.getParameter("pwd");
		
		try {
			//Class.forName("oracle.jdbc.OracleDriver");
			//String url="jdbc:oracle:thin:@192.168.2.62:1521:orcl";
			//Connection con=DriverManager.getConnection(url,"cdac","cdac");
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cdac";
			Connection con=DriverManager.getConnection(url,"cdac","cdac");
			
			PreparedStatement pr=con.prepareStatement("select * from StaffLogin where userid=? and password=?");
			
			pr.setString(1, user);
			pr.setString(2, password);
			ResultSet r = pr.executeQuery();
			
			if(r.next()) {
				response.sendRedirect("StaffFunctions.jsp");
				/*RequestDispatcher rd=request.getRequestDispatcher("HomeServlet");
				rd.include(request, response);*/
			}else {
				response.sendRedirect("index.jsp");
			}
					
			} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}
	}


