package Project;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
public class LoginDao {

 public boolean getLogin(RegisterBean RR)
 {
     String Email10 = RR.getEmail();
     String Password10 = RR.getPassword();
     String emaildb="";
     String passdb="";
     try
     {
         Connection conn=DBConnection.getConnection();
         String query1="select * from student_login ;";
         Statement stmt=conn.createStatement();
         ResultSet rs=stmt.executeQuery(query1);
         while(rs.next())
         {
             emaildb=rs.getString("username");
             passdb=rs.getString("password");
             if(Email10.equals(emaildb) && Password10.equals(passdb))
             {
                 return true;
             }
         }
         
     }
     catch(Exception e)
     {
         
         System.out.println(e);
         
     }
     return false;
 }
}
