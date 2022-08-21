package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCtut3 {
	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root@pass1234");
		System.out.println("Connection Established .."+con);
		
		String sql="insert into users value(5,'Mohan','tiger','vmr',1)";
		
		
		Statement stmt=con.createStatement();
		int no=stmt.executeUpdate(sql);
		System.out.println("No of records added are "+no);
		
		
	}
}
