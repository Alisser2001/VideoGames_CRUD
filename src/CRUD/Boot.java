/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import SQL.SQLModels;
import SQL.SQLRelations;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Alisser
 */
public class Boot {
    public static void main(String[] args){
        //Create Models
        /*SQLModels objModels = new SQLModels();
        objModels.CreateGamesModel();
        objModels.CreateGenresModel();
        objModels.CreatePlatformsModel();
        objModels.CreateStoresModel();
        objModels.CreateTagsModel();*/
        
        //Create Relations
        /*SQLRelations objRel = new SQLRelations();
        objRel.GamesAndGenres();
        objRel.GamesAndPlatforms();
        objRel.GamesAndStores();
        objRel.GamesAndTags();*/
        
        //Get Info API
        API api = new API();
        JSONArray infoAPI = api.InfoAPI();
        System.out.println(infoAPI);
        /*Add windowAdd = new Add();
        windowAdd.setVisible(true);
        windowAdd.setLocationRelativeTo(null);*/
    }
}
