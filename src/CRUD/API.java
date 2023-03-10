/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

/**
 *
 * @author Alisser
 */
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

public class API {

    public JSONArray InfoGamesAPI(){
        String apiKey = "8a94a4cd3fdd4e98bc0f14558d3601b7";
        StringBuilder info = new StringBuilder();
        try {
            URL url = new URL("https://api.rawg.io/api/games?key=" + apiKey);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if(responseCode != 200){
                throw new RuntimeException("Error en tiempo de ejecución: Code "+responseCode);
            }else {
                Scanner scan = new Scanner(url.openStream());
                while (scan.hasNext()){
                    info.append(scan.nextLine());
                }
                scan.close();
            }
                       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
        JSONObject json = new JSONObject(info.toString()); 
        JSONArray infoAPI = json.getJSONArray("results");
        return infoAPI;
    }
    public JSONArray InfoGenresAPI(){
        String apiKey = "8a94a4cd3fdd4e98bc0f14558d3601b7";
        StringBuilder info = new StringBuilder();
        try {
            URL url = new URL("https://api.rawg.io/api/genres?key=" + apiKey);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if(responseCode != 200){
                throw new RuntimeException("Error en tiempo de ejecución: Code "+responseCode);
            }else {
                Scanner scan = new Scanner(url.openStream());
                while (scan.hasNext()){
                    info.append(scan.nextLine());
                }
                scan.close();
            }
                       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
        JSONObject json = new JSONObject(info.toString()); 
        JSONArray infoAPI = json.getJSONArray("results");
        return infoAPI;
    }
    public JSONArray InfoPlatformsAPI(){
        String apiKey = "8a94a4cd3fdd4e98bc0f14558d3601b7";
        StringBuilder info = new StringBuilder();
        try {
            URL url = new URL("https://api.rawg.io/api/platforms?key=" + apiKey);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if(responseCode != 200){
                throw new RuntimeException("Error en tiempo de ejecución: Code "+responseCode);
            }else {
                Scanner scan = new Scanner(url.openStream());
                while (scan.hasNext()){
                    info.append(scan.nextLine());
                }
                scan.close();
            }
                       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
        JSONObject json = new JSONObject(info.toString()); 
        JSONArray infoAPI = json.getJSONArray("results");
        return infoAPI;
    }
    public JSONArray InfoStoresAPI(){
        String apiKey = "8a94a4cd3fdd4e98bc0f14558d3601b7";
        StringBuilder info = new StringBuilder();
        try {
            URL url = new URL("https://api.rawg.io/api/stores?key=" + apiKey);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if(responseCode != 200){
                throw new RuntimeException("Error en tiempo de ejecución: Code "+responseCode);
            }else {
                Scanner scan = new Scanner(url.openStream());
                while (scan.hasNext()){
                    info.append(scan.nextLine());
                }
                scan.close();
            }
                       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
        JSONObject json = new JSONObject(info.toString()); 
        JSONArray infoAPI = json.getJSONArray("results");
        return infoAPI;
    }
    public JSONArray InfoTagsAPI(){
        String apiKey = "8a94a4cd3fdd4e98bc0f14558d3601b7";
        StringBuilder info = new StringBuilder();
        try {
            URL url = new URL("https://api.rawg.io/api/tags?key=" + apiKey);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if(responseCode != 200){
                throw new RuntimeException("Error en tiempo de ejecución: Code "+responseCode);
            }else {
                Scanner scan = new Scanner(url.openStream());
                while (scan.hasNext()){
                    info.append(scan.nextLine());
                }
                scan.close();
            }
                       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
        JSONObject json = new JSONObject(info.toString()); 
        JSONArray infoAPI = json.getJSONArray("results");
        return infoAPI;
    }
}
