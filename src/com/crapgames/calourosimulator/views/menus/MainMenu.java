package com.crapgames.calourosimulator.views.menus;

import com.crapgames.calourosimulator.controller.dbSaver;
import com.crapgames.calourosimulator.views.pcna.Introduction;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.File;
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
        if ((userCheck.getText() != null && !userCheck.getText().isEmpty())){
            File f = new File(userCheck.getText() + ".profile");
                    if(f.exists() && !f.isDirectory()){
                        try {
                            Introduction start = new Introduction(userCheck.getText());
                            dbSaver find = new dbSaver();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                        //iniciar o jogo
                    else//jogar este texto em uma popup
                        System.out.println("Save não existe, primeiro crie personagem");
        }
    }

    @FXML
    public void juh() throws IOException{
        Stage stage;
        Parent root;

        stage = (Stage) juhButton.getScene().getWindow();

        root = FXMLLoader.load(getClass().getResource("Lost.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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

}
