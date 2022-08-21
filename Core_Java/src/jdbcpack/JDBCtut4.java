package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCtut4 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root@pass1234");
		System.out.println("Connection Established .."+con);
		
		
		
			String sql1="create table staff (did int(5),dname varchar(40))";
			
			String sql2="insert into staff values (1,'purchase')";
			String sql22="insert into staff values (2,'sales')";
			
			String sql3="delete from staff where did=2";
			
			
	
			Statement stmt=con.createStatement();
			
			System.out.println(stmt.executeUpdate(sql1));
			System.out.println(stmt.executeUpdate(sql2));
			System.out.println(stmt.executeUpdate(sql22));
			System.out.println(stmt.executeUpdate(sql3));
		
		
		
	}
}
