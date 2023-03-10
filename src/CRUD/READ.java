/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import SQL.SQLConection;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Alisser
 */
public class READ {

    SQLConection conn = new SQLConection();
    ResultSet rs;

    public ResultSet ReadGames() {
        try {
            Connection conect = conn.Conect();
            java.sql.Statement st = conect.createStatement();

            String sql = "SELECT * FROM games;";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet ReadGenres() {
        try {
            Connection conect = conn.Conect();
            java.sql.Statement st = conect.createStatement();

            String sql = "SELECT * FROM genres;";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet ReadPlatforms() {
        try {
            Connection conect = conn.Conect();
            java.sql.Statement st = conect.createStatement();

            String sql = "SELECT * FROM platforms;";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet ReadStores() {
        try {
            Connection conect = conn.Conect();
            java.sql.Statement st = conect.createStatement();

            String sql = "SELECT * FROM stores;";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet ReadTags() {
        try {
            Connection conect = conn.Conect();
            java.sql.Statement st = conect.createStatement();

            String sql = "SELECT * FROM tags;";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
}
