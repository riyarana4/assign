package Project;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
public class RegisterDao {

 public boolean getRegistered(RegisterBean RR)
 {
     String Email10 = RR.getEmail();
     String Password10 = RR.getPassword();
        
     try
     {
         Connection conn=DBConnection.getConnection();
         String query1="insert into student_login values(?,?);";
         PreparedStatement Ps1=conn.prepareStatement(query1);
         Ps1.setString(1,Email10);
         Ps1.setString(2,Password10);
         int i=(int)Ps1.executeLargeUpdate();
         conn.close();
         if(i!=0)
         {
             return true;
         }
         else
         {
             return false;
         }
     }
     catch(Exception e)
     {
         
         System.out.println(e);
         return false;
     }
     
 }
}
