package com.crapgames.calourosimulator.views.menus;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.io.IOException;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 */
public class MainMenu{
    private static Image splashImage = new Image("/assets/backgrounds/ru.png");
    private static  Scene mainMenu;
    @FXML
    private Button quitButton;

    public Scene MainMenu() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        mainMenu = new Scene(root);
        return MainMenu.mainMenu;
    }

    @FXML
    public void quitButtonAction(){
        System.exit(0);
    }

    @FXML
    private void menuCreate(){
        /*Chamar o menu de criação de personagem e exibi-lo, não sei como*/
    }
}
