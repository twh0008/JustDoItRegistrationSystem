package support;
//create separate package?
//need mysql driver in class path
//need to have IP added to access list
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DBConnect {
    // init database constants
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://www.teamredtac.com:3306/teamredt_justdoit";
    private static final String USERNAME = "teamredt_jdi";
    private static final String PASSWORD = "TeamJustDoIt";
    private static final String MAX_POOL = "250";


    private Connection connection;
    private Properties properties;
    private String sqlquery;
    private Statement stmt;
    private ResultSet rs;
    

	// create properties
    private Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
            properties.setProperty("MaxPooledStatements", MAX_POOL);
        }
        return properties;
    }

    // connect database
    public Connection connect() {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, getProperties());
                if (connection != null)
                {
                	System.out.println("Connection Successful");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return connection;
    }
    /**
     * Executes an sql query that selects and updates result set.
     */
    public void dbExecute(){
    	try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sqlquery);
    	}
    	catch(SQLException se){
        se.printStackTrace();
    	}
    }
    /**
     * Executes an update to database. User for inserts.
     * @return int,
     */
    
    public int dbUpdate(){
    	int i = 0;
    	try {
			stmt = connection.createStatement();
			i = stmt.executeUpdate(sqlquery);
    	}
    	catch(SQLException se){
        se.printStackTrace();
    	}
    	return i;
    }

    // disconnect database
    public void disconnect() {
    	if (rs != null) {
            try {
                rs.close();
                rs = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    	if (stmt != null) {
            try {
                stmt.close();
                stmt = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    	if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
	public void setSqlquery(String sqlquery) {
		this.sqlquery = sqlquery;
	}
    
    public ResultSet getRs() {
		return rs;
	}
}                    
                        
                        
                        
                        
                      
