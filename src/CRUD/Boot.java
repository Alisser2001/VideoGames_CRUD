/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import SQL.SQLModels;
import SQL.SQLRelations;
import WINDOWS.ViewGames;

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
        objModels.CreateTagsModel();
        
        //Create Relations
        SQLRelations objRel = new SQLRelations();
        objRel.GamesAndGenres();
        objRel.GamesAndPlatforms();
        objRel.GamesAndStores();
        objRel.GamesAndTags();
        
        //Updated Games Info
        InfoAPI info = new InfoAPI();
        info.InfoGameToDB();
        info.InfoGenresToDB();
        info.InfoPlatformsToDB();
        info.InfoStoresToDB();
        info.InfoTagsToDB();*/
        
        
        
        ViewGames windowGames = new ViewGames();
        windowGames.setVisible(true);
        windowGames.setLocationRelativeTo(null);
    }
}
