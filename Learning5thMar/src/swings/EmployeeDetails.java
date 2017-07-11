package swings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDetails {
	public static void main(String [] args) throws Exception{
		Connection connection=null; 
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial","root","root");
			Statement statement = connection.createStatement(); //Create a SQL statement
			ResultSet rs = statement.executeQuery("select * from employee"); // Execute the query
			System.out.println("Empno  Ename    Job   Hiredate  Salary  Deptno");
			while(rs.next()){
				System.out.print(rs.getInt(1)+ "  ");
				System.out.print(rs.getString(2)+ "  ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getDouble(5)+" ");
				System.out.println(rs.getInt(6)+" ");
				System.out.println(" ");
			}
		}
		catch(SQLException sqlex){}
		finally{
			if(connection != null)
				connection.close();}}}
