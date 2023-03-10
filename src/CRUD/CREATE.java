/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

/**
 *
 * @author Alisser
 */

import SQL.SQLConection;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class CREATE {
    SQLConection conn = new SQLConection();
    
    public void Games(String name, String slug, String img, int rating){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into games(name, slug, img, rating) values('"+name+"', '"+slug+"', '"+img+"', '"+rating+"');";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Genres(String name, String slug,int numGames, String img){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into genres(name, slug, numgames, img) values('"+name+"', '"+slug+"', '"+numGames+"', '"+img+"');";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Platforms(String name, String slug, int numGames, String img){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into platforms(name, slug, numgames, img) values('"+name+"', '"+slug+"', '"+numGames+"', '"+img+"');";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Stores(String name, String domain, int numGames, String img){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into stores(name, domain, numgames, img) values('"+name+"', '"+domain+"', '"+numGames+"', '"+img+"');";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Tags(String name, String slug, int numGames, String img){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "insert into tags(name, slug, numgames, img) values('"+name+"', '"+slug+"', '"+numGames+"', '"+img+"');";
            //Envia la sentencia sql a la DB
            st.execute(sql);
            st.close();
            conect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
