package stellar;

import java.sql.*;
import javax.swing.*;

public class DatabaseConnection {
	Connection conn=null;
public static Connection dbConnector()
{
//This  is required to connect the application to the database
	try {
		Class.forName("org.sqlite.JDBC");
//		The location of the database file
		Connection conn=DriverManager.getConnection("jdbc:sqlite:DataBase.db");
		return conn;
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
		return null;
	}
	}
	
}