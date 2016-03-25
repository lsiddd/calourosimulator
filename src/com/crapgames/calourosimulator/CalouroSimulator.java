package com.crapgames.calourosimulator;

import com.crapgames.calourosimulator.views.RootWindow;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 */
public class CalouroSimulator extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage windowStage) {

        RootWindow rootWindow = new RootWindow("Calouro Simulator", 1024, 768);
        windowStage.setTitle(RootWindow.title);
        windowStage.setHeight(RootWindow.height);
        windowStage.setWidth(RootWindow.width);

        windowStage.show();
    }
}
