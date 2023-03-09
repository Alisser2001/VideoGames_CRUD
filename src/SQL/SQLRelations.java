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
            String sql = "CREATE TABLE games_platforms(id_game INT, id_platform INT, PRIMARY KEY (id_game, id_platform), FOREIGN KEY (id_game) REFERENCES games(id), FOREIGN KEY (id_platform) REFERENCES platforms(id))";
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "La relación entre Games y Platforms se realizó exitosamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);

        }
    }
    public void GamesAndGenres(){
        try{
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE games_genres(id_game INT, id_genre INT, PRIMARY KEY (id_game, id_genre), FOREIGN KEY (id_game) REFERENCES games(id), FOREIGN KEY (id_genre) REFERENCES genres(id))";
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "La relación entre Games y Genres se realizó exitosamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);

        }
    }
    public void GamesAndStores(){
        try{
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE games_stores(id_game INT, id_store INT, PRIMARY KEY (id_game, id_store), FOREIGN KEY (id_game) REFERENCES games(id), FOREIGN KEY (id_store) REFERENCES stores(id))";
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "La relación entre Games y Stores se realizó exitosamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);

        }
    }
    public void GamesAndTags(){
        try{
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE games_tags(id_game INT, id_tag INT, PRIMARY KEY (id_game, id_tag), FOREIGN KEY (id_game) REFERENCES games(id), FOREIGN KEY (id_tag) REFERENCES tags(id))";
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "La relación entre Games y Tags se realizó exitosamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);

        }
    }
}
