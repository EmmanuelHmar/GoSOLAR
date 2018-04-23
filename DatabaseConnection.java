package stellar;

import java.sql.*;
import javax.swing.*;

public class DatabaseConnection {
	Connection conn=null;
	/* This method connect the database to the code */
public static Connection dbConnector()
{
    
   
	try {
		Class.forName("org.sqlite.JDBC");
		Connection conn=DriverManager.getConnection("jdbc:sqlite:/Users/hamedouldhamou/Desktop/Hamed/Stellar/DataBase.db"); // Connecting the DataBase by using the path
		return conn; // the method returns the connection
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
		return null;
	}
	}
	
}