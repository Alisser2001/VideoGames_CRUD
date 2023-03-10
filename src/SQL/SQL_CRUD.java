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
    
    public void InsertGames(int id, String name, String slug, String img, int rating){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into games(id, name, slug, img, rating) values('"+id+"', '"+name+"', '"+slug+"', '"+img+"', '"+rating+"')";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void InsertGenres(int id, String name, String slug,int numGames, String img){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into genres(id, name, slug, numgames, img) values('"+id+"', '"+name+"', '"+slug+"', '"+numGames+"', '"+img+"')";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void InsertPlatforms(int id, String name, String slug, int numGames, String img){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into platforms(id, name, slug, numgames, img) values('"+id+"', '"+name+"', '"+slug+"', '"+numGames+"', '"+img+"')";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void InsertStores(int id, String name, String domain, int numGames, String img){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into stores(id, name, domain, numgames, img) values('"+id+"', '"+name+"', '"+domain+"', '"+numGames+"', '"+img+"')";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void InsertTags(int id, String name, String slug, int numGames, String img){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into tags(id, name, slug, numgames, img) values('"+id+"', '"+name+"', '"+slug+"', '"+numGames+"', '"+img+"')";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
