package jforms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class database {
	public void login(String name, String pwd) throws Exception {
		
		String url= "jdbc:mysql://localhost:3306";
		String uname = "root";
		String pass= "";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement stt = con.createStatement();
		
		
		
		
		stt.execute("USE login");

		ResultSet res = stt.executeQuery("SELECT * FROM users");
		
		while(res.next()) {
			String name_1 = res.getString("Username");
			String pwd_1 = res.getString("Password");
			
			if (name.equals(name_1)&& pwd.equals(pwd_1)) {
				JOptionPane.showInputDialog(this,"Hello");
				
			}
			
			
		}
		
	}

}
