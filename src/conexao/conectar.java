package conexao;
import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {
    
    public Connection getConectar(){
       try{     
          Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lanchonetejbfoods","root","1xwç00.lv24!#");
                                                      
         return conn;}
    
       catch(Exception e){
           System.out.println("erro ao conectar: "+e.getMessage());
             return null;}}}
       
       
