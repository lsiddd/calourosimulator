package com.crapgames.calourosimulator.controller;

import com.crapgames.calourosimulator.views.SplashScreen;
import com.crapgames.calourosimulator.views.menus.MainMenu;
import com.crapgames.calourosimulator.views.menus.MenuCreate;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/26/16.
 */
public class MainController {
    public void start(Stage windowStage) {
        Scene splashScreen = SplashScreen.getScene(windowStage.getWidth(), windowStage.getHeight(), windowStage);
        windowStage.setScene(splashScreen);
    }
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

    public void startCreate(Stage windowStage){
            try {
                MenuCreate menu = new MenuCreate();
                Scene menuShow = menu.menuCreate();
                windowStage.setScene(menuShow);
            }
            catch(Exception e){
                e.printStackTrace();
            }
    }

}
