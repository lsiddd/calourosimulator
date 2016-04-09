package com.crapgames.calourosimulator;

import com.crapgames.calourosimulator.controller.MainController;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 */
public class CalouroSimulator extends Application {

    private final String title = "Calouro Simulator";
    private final double height = 600;
    private final double width = 800.0;
    private Stage windowStage;
    boolean change = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        this.windowStage = primaryStage;

        this.windowStage.setTitle(this.title);
        this.windowStage.setHeight(this.height);
        this.windowStage.setWidth(this.width);
        MainController mainController = new MainController();

        if (change == false) {
            mainController.start(this.windowStage);
            this.windowStage.show();
            change = true;
        }
        if (change == true) {
            mainController.startCreate(this.windowStage);
            this.windowStage.show();
        }
    }


}
