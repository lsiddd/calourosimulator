package com.crapgames.calourosimulator.views.menus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by lucas on 12/04/16.
 */
public class About {

    @FXML
    Button goBack = new Button();

    private static Scene about;

    public Scene aboutScene() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../menus/About.fxml"));
        about = new Scene(root);
        return About.about;
    }

    @FXML
    private void mainButton() throws IOException{
        Stage stage;
        Parent root;

        stage = (Stage) goBack.getScene().getWindow();

        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
