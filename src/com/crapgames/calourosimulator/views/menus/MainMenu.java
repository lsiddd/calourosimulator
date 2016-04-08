package com.crapgames.calourosimulator.views.menus;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    private String user;
    @FXML
    TextField userCheck = new TextField();

    @FXML
    PasswordField pswdCheck = new PasswordField();


    public Scene MainMenu() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        mainMenu = new Scene(root);
        return MainMenu.mainMenu;
    }

    @FXML
    private void checkAndStart(){
        if ((userCheck.getText() != null && !userCheck.getText().isEmpty())){}
            /*Aqui vai ser comparado o campo de username com o que estiver cadastrado*/
        if(pswdCheck.getText() != null && !pswdCheck.getText().isEmpty()){}
            /*Aqui sai ser comparado o campo de senha com o que estiver salvo*/
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
