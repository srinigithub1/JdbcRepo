package demoJdbcPkg;
import java.sql.*;

public class jdbcdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String driver="com.mysql.jdbc.Driver";
//		String url="jdbc:mysql://localhost:3306/school";
//		String username="root";
//		String password="root";
		
		
		// for Oracle:
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521/XE";
		String username="SYSTEM";
		String password="Tiger@1234";
		
		try{
			// register the driver
			Class.forName(driver);
			
			// get the connection
			Connection con=DriverManager.getConnection(url,username,password);
			
			//create the stmt object
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("insert into student values(2,'Suresh')");
			stmt.executeUpdate("insert into student values(3,'Mahesh')");
			stmt.executeUpdate("insert into student values(4,'Sailesh')");
			stmt.executeUpdate("insert into student values(5,'Alex')");
			
			
			// close the connection
			con.close();
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
