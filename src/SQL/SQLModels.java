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
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SQLModels {

    SQLConection conn = new SQLConection();
    Connection conect = conn.Conect();

    public void CreateGamesModel() {
        try {
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE games(id INT NOT NULL UNIQUE, name TEXT NOT NULL, slug TEXT NOT NULL, img TEXT, rating INT, PRIMARY KEY (id))";
            st.execute(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CreateGenresModel() {
        try {
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE genres(id INT NOT NULL UNIQUE, name TEXT NOT NULL, slug TEXT NOT NULL, numgames INT NOT NULL, img TEXT, PRIMARY KEY (id))";
            st.execute(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CreatePlatformsModel() {
        try {
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE platforms(id INT NOT NULL UNIQUE, name TEXT NOT NULL, slug TEXT NOT NULL, numgames INT NOT NULL, img TEXT, PRIMARY KEY (id))";
            st.execute(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CreateStoresModel() {
        try {
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE stores(id INT NOT NULL UNIQUE, name TEXT NOT NULL, domain TEXT NOT NULL, numgames INT NOT NULL, img TEXT, PRIMARY KEY (id))";
            st.execute(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CreateTagsModel() {
        try {
            Statement st = conect.createStatement();
            String sql = "CREATE TABLE tags(id INT NOT NULL UNIQUE, name TEXT NOT NULL, slug TEXT NOT NULL, numgames INT NOT NULL, img TEXT, PRIMARY KEY (id))";
            st.execute(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }
}
