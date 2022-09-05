package com.vms.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.vms.windows.DashboardPage;
import com.vms.windows.LoginPage;

public class Oracon {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static String user = "system";
	private static String pass = "root";
	
	public static String mobile = null;
	public static String vchoice = null;
	public static String vcenter = null;
	public static String vstate = null;
	
	public static String fname = null;
	public static String mno = null;
	public static String address = null;
	public static String lname = null;



	
	
		int b=0;
		public int insertIntoDB(ArrayList al) {
			String insert ;

			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			

			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();

			insert = "INSERT into nUser VALUES( uid_seq.nextval,?,?,?,?,?,?,?)";

			ps1 = con.prepareStatement(insert);
			
			ps1.setString(1, (String) al.get(0));

			ps1.setString(2, (String) al.get(1));

			ps1.setString(3, (String) al.get(2));
			ps1.setString(4, (String) al.get(3));

			ps1.setString(5, (String) al.get(4));

			ps1.setString(6, (String) al.get(5));

			ps1.setString(7, (String) al.get(6));

		//	ps1.setString(8, (String) al.get(7));

			b=ps1.executeUpdate();

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}

			return b;

			}
		public boolean login ( String id , String pass )
		{
			  String driver = "oracle.jdbc.driver.OracleDriver";
			  String url = "jdbc:oracle:thin:@localhost:1521:XE";
			  String user = "system";
			  String passw = "root";
			Connection con = null;
			Statement st = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String pass1 = null;
			String name = null;
			//String eid = null;
			int ab = 0;
			boolean b = false ;
			
			
			String select = null;
			
			try {
				
				Class.forName(driver);
				con = DriverManager.getConnection(url , user , passw);
				st = con.createStatement();
				
				select = "select fName , password from nUser where EMAIL_ID = ?";//and password = '?'
				
				ps = con.prepareStatement(select);
				ps.setString(1, id);
			  //  ps.setString(2, pass);
				rs = ps.executeQuery();
				
				while(rs.next()) 
				{
					//eid = rs.getString(2);
					name = rs.getString(1);
					pass1 = rs.getString(2);
					
				//	System.out.println(" "+id +" "+pass);
					
					
				}
				if(pass.equals(pass1) ) {
//					JOptionPane.showMessageDialog(null,"your id is : "+pass1);
					JOptionPane.showMessageDialog(null, "Welcome "+name);
					DashboardPage dbp = new DashboardPage(id);
					LoginPage lp = new LoginPage();
					
					dbp.setVisible(true);
					lp.setVisible(false);
				b =true;
				}
				else {
					
					b = false;
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException i) {
				// TODO Auto-generated catch block
				i.printStackTrace();
			} catch (Exception u) {
				u.printStackTrace();
			}
			return b;
			
		}
		
		// *************************************************************************************************************
		// DASHBOARD METHOD
		
		
		public int insertIntoDBT(ArrayList al) {
			String insert ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();

			insert = "INSERT into dUser VALUES( ?,?,?,?)";// DATE CH RAHILAY BE !!!!!...

			ps1 = con.prepareStatement(insert);
			ps1.setString(1, (String) al.get(0));
			ps1.setString(2, (String) al.get(1));
			ps1.setString(3, (String) al.get(2));
			ps1.setString(4, (String) al.get(3));
			//ps1.setString(5, (String) al.get(4));
			b=ps1.executeUpdate();

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}

			return b;

			}
	
		public void view(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();
			
			show = "select MOBILE , VCHOICE	, VCENTER , VSTATE from dUser where MOBILE=?";
			
			ps1 = con.prepareStatement(show);
			ps1.setString(1, contact);
			
			rs = ps1.executeQuery();
			
			while(rs.next()) {
				mobile =  rs.getString(1);
				vchoice = rs.getString(2);
				vcenter = rs.getString(3);
				vstate = rs.getString(4);
				
			}
			
			
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

				e1.printStackTrace();

				} catch (SQLException i) {

				// TODO Auto-generated catch block

				i.printStackTrace();

				} catch (Exception u) {

				u.printStackTrace();

				}
			

		}
		public void view1(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();
			
			show = "select fname, mobile , ADDRESS from nUser where EMAIL_ID=?";
			
			ps1 = con.prepareStatement(show);
			ps1.setString(1, contact);
			
			rs = ps1.executeQuery();
			
			while(rs.next()) {
				fname =  rs.getString(1);				
				mno = rs.getString(2);
				address = rs.getString(3);
				
			}
			
			
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

				e1.printStackTrace();

				} catch (SQLException i) {

				// TODO Auto-generated catch block

				i.printStackTrace();

				} catch (Exception u) {

				u.printStackTrace();

				}
			

		}
		
		
}
	


