package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewRequest
 */
@WebServlet("/NewRequest")
public class NewRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		pw.println("<h1 align='center'>New User Requests</h1>");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cdac";
			Connection con=DriverManager.getConnection(url,"cdac","cdac");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from newrequest");
			pw.println("<table border='2px' align='center'><thead><tr><td>USERID</td><td>PASSWORD</td><td>MOBNO</td><td>RESPONSE</td><td>REQUEST DENIED</td>");
			while(rs.next()) {
			pw.println("<tbody ><tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td><a href='#'>RESPONSE</td><td><a href='#'>REQUEST DENIED</td></tbody>");
			}
			pw.println("</table>");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	}


