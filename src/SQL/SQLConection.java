/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

/**
 *
 * @author Alisser
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class SQLConection {
    Connection conn = null;
    String url = "jdbc:postgresql://localhost/JavaCRUD";
    String user = "postgres";
    String password = "321724AAa";
    
    public Connection Conect(){
        try{
            //Inizialize teh driver
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error to connect" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
}
