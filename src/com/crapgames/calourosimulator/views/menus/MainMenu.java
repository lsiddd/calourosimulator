package com.crapgames.calourosimulator.views.menus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import com.crapgames.calourosimulator.views.about.*;
import java.io.IOException;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 */
public class MainMenu{

    private static  Scene mainMenu;

    @FXML
    Button aboutButton = new Button();

    @FXML
    TextField userCheck = new TextField();

    @FXML
    Button juhButton = new Button();

    @FXML
    Button menuCreate = new Button();


    public Scene MainMenu() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        mainMenu = new Scene(root);
        return MainMenu.mainMenu;
    }

    @FXML
    private void checkAndStart(){

        /*Aqui vai ser comparado o campo de username com o que estiver cadastrado*/
        if ((userCheck.getText() != null && !userCheck.getText().isEmpty())){}
    }

    @FXML
    public void quitButtonAction(){
        System.exit(0);
    }

    @FXML
    private void menuCreate() throws IOException{
        Stage stage;
        Parent root;

        stage = (Stage) menuCreate.getScene().getWindow();

        root = FXMLLoader.load(getClass().getResource("MenuCreate.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void aboutCall() throws IOException{
        Stage stage;
        Parent root;

        stage = (Stage) aboutButton.getScene().getWindow();

        root = FXMLLoader.load(getClass().getResource("About.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void juh(){System.out.println("Perdi");}
}
