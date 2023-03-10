/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alisser
 */
public class SQLRelations {
    SQLConection conn = new SQLConection();
    Connection conect = conn.Conect();
    public void GamesAndPlatforms(){
        try{
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE games_platforms(id_game INT, id_platform INT, PRIMARY KEY (id_game, id_platform), FOREIGN KEY (id_game) REFERENCES games(id), FOREIGN KEY (id_platform) REFERENCES platforms(id));";
            st.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);

        }
    }
    public void GamesAndGenres(){
        try{
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE games_genres(id_game INT, id_genre INT, PRIMARY KEY (id_game, id_genre), FOREIGN KEY (id_game) REFERENCES games(id), FOREIGN KEY (id_genre) REFERENCES genres(id));";
            st.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);

        }
    }
    public void GamesAndStores(){
        try{
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE games_stores(id_game INT, id_store INT, PRIMARY KEY (id_game, id_store), FOREIGN KEY (id_game) REFERENCES games(id), FOREIGN KEY (id_store) REFERENCES stores(id));";
            st.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);

        }
    }
    public void GamesAndTags(){
        try{
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE games_tags(id_game INT, id_tag INT, PRIMARY KEY (id_game, id_tag), FOREIGN KEY (id_game) REFERENCES games(id), FOREIGN KEY (id_tag) REFERENCES tags(id));";
            st.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);

        }
    }
    public void SetRelationGamePlatform(int IDGame, int IDPlatform){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "INSERT INTO games_platforms(id_game, id_platform) VALUES ('"+IDGame+"', '"+IDPlatform+"');";
            st.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);            
        }
    }
    public void SetRelationGameGenre(int IDGame, int IDGenre){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "INSERT INTO games_genres(id_game, id_genre) VALUES ('"+IDGame+"', '"+IDGenre+"');";
            st.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);            
        }
    }
    public void SetRelationGameStore(int IDGame, int IDStore){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "INSERT INTO games_stores(id_game, id_store) VALUES ('"+IDGame+"', '"+IDStore+"');";
            st.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);            
        }
    }
    public void SetRelationGameTag(int IDGame, int IDTag){
        try{
            //Direct Connect with the DB
            Connection conect = conn.Conect();
            //Objeto que nos permitirá crear sentencias SQL
            java.sql.Statement st = conect.createStatement();
            String sql = "INSERT INTO games_tags(id_game, id_tag) VALUES ('"+IDGame+"', '"+IDTag+"');";
            st.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);            
        }
    }
}
