package com.crapgames.calourosimulator.controller;

import com.crapgames.calourosimulator.views.SplashScreen;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/26/16.
 */
public class MainController {
    public void start(Stage windowStage) {
        Scene splashScreen = SplashScreen.getScene(windowStage.getWidth(), windowStage.getHeight());
        windowStage.setScene(splashScreen);
    }
}
