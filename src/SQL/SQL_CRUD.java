/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

/**
 *
 * @author Alisser
 */

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class SQL_CRUD {
    SQLConection conn = new SQLConection();
    
    public void Insert(String id, String name, String slug, String img){
        try{
            //Direct Connect with the DB
            int idDB = parseInt(id);
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into games(id, name, slug, img) values('"+id+"', '"+name+"', '"+slug+"', '"+img+"')";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
            JOptionPane.showMessageDialog(null, "El registro se guardó correctamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
