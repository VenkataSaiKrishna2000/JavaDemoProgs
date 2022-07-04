/*
     create table Emp (id int , Name varchar(10),Age int, Salary int,Desig varchar(10));


*/
import java.util.*;
import java.sql.*;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/74425_swaroop","root","Password123");
			Statement stmt= con.createStatement();
			stmt.execute("insert into emp values(101,'Ramesh','34',80000,'Manager')");
			stmt.close();
			System.out.println("Data saved successfully");
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}