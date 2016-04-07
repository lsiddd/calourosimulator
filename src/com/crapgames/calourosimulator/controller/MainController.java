package com.crapgames.calourosimulator.controller;

import com.crapgames.calourosimulator.CalouroSimulator;
import com.crapgames.calourosimulator.views.*;
import com.crapgames.calourosimulator.views.menus.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

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

}
