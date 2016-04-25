package com.crapgames.calourosimulator.controller;

import com.crapgames.calourosimulator.views.menus.MainMenu;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/26/16.
 */
public class MainController {
    public void startMenu(Stage windowStage){
        try {
            MainMenu menu = new MainMenu();
            Scene menuShow = menu.MainMenu();
            windowStage.setScene(menuShow);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
