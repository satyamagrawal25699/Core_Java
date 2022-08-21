package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCtut {
		public static void main(String[] args)throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root@pass1234");
			
			System.out.println("Connection ......"+con);
		}
		
}
