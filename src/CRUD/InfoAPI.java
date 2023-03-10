/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import SQL.SQLRelations;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Alisser
 */
public class InfoAPI {

    //Get Info API
    API api = new API();
    private final JSONArray infoGamesAPI = api.InfoGamesAPI();
    private final JSONArray infoGenresAPI = api.InfoGenresAPI();
    private final JSONArray infoPlatformsAPI = api.InfoPlatformsAPI();
    private final JSONArray infoStoresAPI = api.InfoStoresAPI();
    private final JSONArray infoTagsAPI = api.InfoTagsAPI();
    private final CREATE insert = new CREATE();
    private final SQLRelations objRelation = new SQLRelations();

    public void InfoGameToDB() {
        try {
            for (int i = 0; i < infoGamesAPI.length(); i++) {
                JSONObject game = infoGamesAPI.getJSONObject(i);
                if (game.has("id")) {
                    String name = game.getString("name");
                    String slug = game.getString("slug");
                    int rating = game.getInt("rating");
                    String img = game.getString("background_image");
                    insert.Games(name, slug, img, rating);
                }
            }
            JOptionPane.showMessageDialog(null, "La info Games de la API se subió correctamente", "Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException | JSONException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void InfoGenresToDB() {
        try {
            for (int i = 0; i < infoGenresAPI.length(); i++) {
                JSONObject genre = infoGenresAPI.getJSONObject(i);
                if (genre.has("id")) {
                    String name = genre.getString("name");
                    String slug = genre.getString("slug");
                    int numGames = genre.getJSONArray("games").length();
                    String img = genre.getString("image_background");
                    insert.Genres(name, slug, numGames, img);
                }
            }
            JOptionPane.showMessageDialog(null, "La info Genres de la API se subió correctamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | JSONException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void InfoPlatformsToDB() {
        try {
            for (int i = 0; i < infoPlatformsAPI.length(); i++) {
                JSONObject platform = infoPlatformsAPI.getJSONObject(i);
                if (platform.has("id")) {
                    String name = platform.getString("name");
                    String slug = platform.getString("slug");
                    int numGames = platform.getJSONArray("games").length();
                    String img = platform.getString("image_background");
                    insert.Platforms(name, slug, numGames, img);
                }
            }
            JOptionPane.showMessageDialog(null, "La info Platforms de la API se subió correctamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | JSONException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void InfoStoresToDB() {
        try {
            for (int i = 0; i < infoStoresAPI.length(); i++) {
                JSONObject store = infoStoresAPI.getJSONObject(i);
                if (store.has("id")) {
                    String name = store.getString("name");
                    String domain = store.getString("domain");
                    int numGames = store.getJSONArray("games").length();
                    String img = store.getString("image_background");
                    insert.Stores(name, domain, numGames, img);
                }
            }
            JOptionPane.showMessageDialog(null, "La info Stores de la API se subió correctamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | JSONException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void InfoTagsToDB() {
        try {
            for (int i = 0; i < infoTagsAPI.length(); i++) {
                JSONObject tag = infoTagsAPI.getJSONObject(i);
                if (tag.has("id")) {
                    String name = tag.getString("name");
                    String slug = tag.getString("slug");
                    int numGames = tag.getJSONArray("games").length();
                    String img = tag.getString("image_background");
                    insert.Tags(name, slug, numGames, img);
                }
            }
            JOptionPane.showMessageDialog(null, "La info Tags de la API se subió correctamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | JSONException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }
}
