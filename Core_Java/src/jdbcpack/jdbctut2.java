package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class jdbctut2 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root@pass1234");
		
		System.out.println("Connection ......"+con);
		
		String str="select* from users where city='pune'";
		
		Statement stmp=con.createStatement();
		ResultSet rs =stmp.executeQuery(str);
		
		if(rs.next()) {
			System.out.println("UID..."+rs.getInt(1)+" UNAME..."+rs.getString(2)+" UPASS...."+rs.getString(3)+" CITY..."+rs.getString(4)+" FLAG...."+rs.getString(5));
		}
		
		else {
			System.out.println("No Records found ");
		}

		
	}
}
