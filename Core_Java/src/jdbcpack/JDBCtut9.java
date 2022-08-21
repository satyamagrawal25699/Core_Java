package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;



public class JDBCtut9 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root@pass1234");
		System.out.println("Connection Established .."+con);
		
		CallableStatement cs=con.prepareCall("{call proc2()}");
		
		int n=cs.executeUpdate();
		System.out.println("No of records updated are :"+n);
		
		cs=con.prepareCall("{call proc3(?,?)}");
		cs.setString(1, "rahim");
		cs.setInt(2, 0);
		
		n=cs.executeUpdate();
		System.out.println("No of records updated are "+n);
		
		
		
		
	}
}
