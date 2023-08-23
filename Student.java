package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Student {
	public void createDatabase()
	{
//		driver load
//		connection establish
//		statement create
//		execute - query
//		connection close
		try
		{
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "admin";
			Connection conn = DriverManager.getConnection(url,userName, password);
			Statement stm = conn.createStatement();
			String query = "create database Sample";
			stm.execute(query);
			System.out.println("Database created Successfully! ");
			conn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}

	public void createTable() {

		try
		{
			String url = "jdbc:mysql://localhost:3306/sample";
			String userName = "root";
			String password = "admin";
			Connection conn = DriverManager.getConnection(url,userName, password);
			Statement stm = conn.createStatement();
			String query = "create table Student (sid int(3), name varchar(50), marks int);";
			stm.execute(query);
			System.out.println("Table created Successfully! ");
			conn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public void createData() {
		try
		{
			String url = "jdbc:mysql://localhost:3306/sample";
			String userName = "root";
			String password = "admin";
			Connection conn = DriverManager.getConnection(url,userName, password);
			String query = "INSERT INTO Student (sid, name, marks) Values (3 , 'Bha', 98)";
			PreparedStatement pstm = conn.prepareStatement(query);
//			pstm.setInt(1, 1);
//			pstm.setString(2, "Ram");
//			pstm.setInt(3, 100);
			pstm.execute(query);
			System.out.println("Data inserted Successfully! ");
			conn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void readData() {
		try
		{
			String url = "jdbc:mysql://localhost:3306/sample";
			String userName = "root";
			String password = "admin";
			Connection conn = DriverManager.getConnection(url,userName, password);
			Statement stm = conn.createStatement();
			String query = "Select * from Student";
			ResultSet st = stm.executeQuery(query);
			List<StudentPojo> data = new ArrayList<>(); 
			while(st.next()) 
			{
				StudentPojo ob = new StudentPojo();
				ob.setSid(st.getInt(1));
				ob.setName(st.getString(2));
				ob.setMarks(st.getDouble(3));
				data.add(ob);
			}
			for(int i = 0; i<data.size(); i++)
			{
				System.out.println(data.get(i).toString());
			}
//				System.out.println(st.getInt(1)+"  "+st.getString(2)+"  "+st.getInt(3)); 
			conn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

	public void updateData() {
		try
		{
			String url = "jdbc:mysql://localhost:3306/sample";
			String userName = "root";
			String password = "admin";
			Connection conn = DriverManager.getConnection(url,userName, password);
			String query = "UPDATE Student SET sid = ? WHERE name = ?";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, 4);
			pstm.setString(2,"Bha");
			pstm.execute();
			System.out.println("Data Updated Successfully! ");
			conn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public void deleteData() {
		try
		{
			String url = "jdbc:mysql://localhost:3306/sample";
			String userName = "root";
			String password = "admin";
			Connection conn = DriverManager.getConnection(url,userName, password);
			String query = "UPDATE Student SET sid = ? WHERE name = ?";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, 4);
			pstm.setString(2,"Bha");
			pstm.execute();
			System.out.println("Data Updated Successfully! ");
			conn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}