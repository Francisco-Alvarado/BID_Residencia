package conexiondepurada;
import java.sql.*;

public class Conexion {
	//Declaraci�n de variables est�ticas finales para la conexi�n
	private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String JDBC_URL = "jdbc:sqlserver://JAVIERALVARADO\\BID:1433;databaseName=Biblioteca";
	private static final String JDBC_USER = "sa";
	private static final String JDBC_PASS = "1234";
	private static final Driver driver = null;
	
	public static synchronized Connection getConexion() throws SQLException{
		if(driver == null){
			try{
				Class jdbcClass = Class.forName(JDBC_DRIVER);
				Driver driver = (Driver) jdbcClass.newInstance();
				DriverManager.registerDriver(driver);
			}catch(Exception e){
				System.err.println("FALLO AL CARGAR DRIVER");
				e.printStackTrace();
			}
		}
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
	}
	
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}