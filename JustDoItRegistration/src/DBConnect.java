//create seperate package?
//need mysql driver in class path
//need to have IP added to access list
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect 
{

   public static void main(String[] args) 
   {
      try {
         String host = "jdbc:mysql://www.teamredtac.com/teamredt_justdoit";
         String userName;
         String userPass;
      
         Connection con = DriverManager.getConnection(host, userName, userPass);
         if (con != null) {
            System.out.println("Connection Successful");
         } 
         else {
            System.out.println("Failed to make connection!");
         }
      
         
      }
      catch (SQLException err) {
         System.out.println(err.getMessage());
      }
             
   }
   
                        
                        
                        
                        
                        
                        
                      
}