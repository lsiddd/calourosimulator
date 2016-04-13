package com.crapgames.calourosimulator.views.menus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by lucas on 12/04/16.
 */
public class About {

    @FXML
    ImageView bkImg = new ImageView();

    @FXML
    private void mainButton() throws IOException{//se a img for clicada voltar pro menu principal
        Stage stage;
        Parent root;

        stage = (Stage) bkImg.getScene().getWindow();

        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
