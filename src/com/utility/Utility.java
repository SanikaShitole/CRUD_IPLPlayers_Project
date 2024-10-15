package com.utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Utility {

	private static String path="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/project1199";
	private static String user="root";
	private static String psw="root";
    private static Connection con=null;
	private static Statement st=null;
	private static ResultSet rs =null;
	
	private Utility() {
		
		
	}
		public static Statement CreateConnection(){
				try{
					Class.forName(path);
					con = DriverManager.getConnection(url, user, psw);
					st = con.createStatement();
				}catch (ClassNotFoundException e){
					System.out.println(e);
				}catch (SQLException e) {
					System.out.println(e);
				}
				return st;
				
		}
		public static Connection ToInsertConnection() {
			
			try {
				Class.forName(path);
				con=DriverManager.getConnection(url,user,psw);
			}catch(ClassNotFoundException e) {
				System.out.println(e);
			}catch(SQLException e) {
				System.out.println(e);	
			}
			return con;
			
		}
		public static void CloseConnection() {
			
			try {
				if(st!=null && con!=null) {
					st.close();
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
			
		}
	}
	

