

package electrictity.billing.system;

import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
    Conn(){
        
        
        try{
            
            
         c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs1","root","Sscpmt@43215" );
         s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
    }
    
}
