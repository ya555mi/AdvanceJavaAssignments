package Servletpage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBConnection
{
   
	public static Connection sqlConnection() throws ClassNotFoundException, SQLException
	{
		

			Class.forName("com.mysql.cj.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/sqldata?allowPublicKeyRetrieval=true&useSSL=false";
			String db_uname="root";
			String db_upass="root";
			Connection	 connection=DriverManager.getConnection(db_url,db_uname,db_upass);
            return connection;
		
	}
	}
