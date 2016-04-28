package com.crapgames.calourosimulator;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import com.crapgames.calourosimulator.viewsControl.SplashScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 * PELO FIM DA GAMBIARRA, MEU VOTO É SIM
 */
public class CalouroSimulator extends Application {

    private final String title = "Calouro Simulator";
    private final double height = 600;
    private final double width = 800.0;
    private Stage windowStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        this.windowStage = primaryStage;

        this.windowStage.setTitle(this.title);
        this.windowStage.setHeight(this.height);
        this.windowStage.setWidth(this.width);
        this.windowStage.setResizable(false);
        SplashScreen a = new SplashScreen();
        a.transition();


        try {
            fxmlCaller mm = new fxmlCaller();
            Scene  scene = new Scene(mm.splashScreen());
            windowStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
        windowStage.show();
    }

}
