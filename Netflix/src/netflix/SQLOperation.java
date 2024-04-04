
package netflix;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQLOperation {
private Connection conn = null;   
private String url = "jdbc:postgresql://localhost:5432/Netflix";
private String username = "postgres";
private String password = "admin";

public SQLOperation() {
try{
 conn = DriverManager.getConnection(url, username, password);
    //System.out.println("You're in");
}catch(SQLException e){
   // System.out.println("olmadı");
    System.out.println(e.getSQLState());
} 
 }
public SQLOperation(String url,String username,String password){
this.url = url;
this.username = username;
this.password = password;
try{
 conn = DriverManager.getConnection(url, username, password);
    System.out.println("You're in");
}catch(SQLException e){
    System.out.println("olmadı");
    System.out.println(e.getSQLState());
}
}
 public ResultSet selectOperation(String Query){
    Statement stmt = null;
     try{
    stmt = conn.createStatement();
    }catch(SQLException e){
    Logger.getLogger(Netflix.class.getName()).log(Level.SEVERE, null, e);
    }
    ResultSet rs= null;
    try{
    rs = stmt.executeQuery(Query);
    }catch(SQLException e){
    Logger.getLogger(Netflix.class.getName()).log(Level.SEVERE, null, e);
    }
    return rs;
}
 public String insertOperation(PreparedStatement ps){
 try{
 ps.execute();
 return "Başarılı";
 }catch(SQLException e){
 return e.getMessage().toString();
 }
 
 }
    }

