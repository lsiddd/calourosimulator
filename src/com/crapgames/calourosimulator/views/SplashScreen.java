package com.crapgames.calourosimulator.views;

import com.crapgames.calourosimulator.views.menus.MainMenu;
import javafx.animation.FadeTransition;
import javafx.animation.SequentialTransition;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 */
public class SplashScreen {

    private static Image splashImage = new Image(Assets.ufpaLogo);
    private static Scene splashScene;

    public static Scene getScene(double windowWidth, double windowHeight, Stage windowStage) {

        BorderPane splashPanel = new BorderPane();
        splashScene = new Scene(splashPanel, windowWidth, windowHeight, Color.BLACK);


        ImageView siv = new ImageView();
        siv.setImage(SplashScreen.splashImage);
        siv.setPreserveRatio(true);

        splashPanel.setCenter(siv);

        FadeTransition fadeIn = new FadeTransition(Duration.millis(2000), splashPanel);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1.0);

        FadeTransition fadeOut = new FadeTransition(Duration.millis(2000), splashPanel);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0);

        SequentialTransition transition = new SequentialTransition();
        transition.getChildren().addAll(fadeIn, fadeOut);
        transition.play();


        return SplashScreen.splashScene;
    }


}
