package utils;
import java.sql.Connection;
import java.sql.DriverManager;
public class MysqlDBConexion {
	public static Connection getConexion(){
		Connection cn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost/dswii_ec3?serverTimezone=UTC","root","??Mysql1991");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;	
	}
}

