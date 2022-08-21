package jdbcpack;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JDBCtut5 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root@pass1234");
		System.out.println("Connection Established .."+con);
		
		DatabaseMetaData dmd=con.getMetaData();
		
		System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getDefaultTransactionIsolation());
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getUserName());
		System.out.println(dmd.getDriverVersion());
		
		
	}
}
