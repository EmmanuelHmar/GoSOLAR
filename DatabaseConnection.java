package stellar;

import java.sql.*;
import javax.swing.*;

public class DatabaseConnection {
	Connection conn=null;
public static Connection dbConnector()
{
    
   
	try {
		Class.forName("org.sqlite.JDBC");
		Connection conn=DriverManager.getConnection("jdbc:sqlite:/Users/hamedouldhamou/Desktop/Hamed/Stellar/DataBase.db");
		//JOptionPane.showMessageDialog(null, "Connection Successful");
		return conn;
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
		return null;
	}
	}
	
}