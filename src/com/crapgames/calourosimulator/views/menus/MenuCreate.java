package com.crapgames.calourosimulator.views.menus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.*;

import java.io.IOException;

/**
 * Created by lucas on 07/04/16.
 */
public class MenuCreate {
    @FXML
    TextField username = new TextField();

    @FXML
    ComboBox sexBox = new ComboBox();

    @FXML
    Button goBack = new Button();

    String name;
    Object selected;
    /*
    * AGORA É JOGAR ÇASPORRA TD PRA DATABASE LEK
    * SEI NÃO*/
    @FXML
    private void writeBuffers(){
        if ((username.getText() != null && !username.getText().isEmpty())){//deve ser selecionado um nome

            if (sexBox.getSelectionModel().getSelectedItem() != null) {//deve ser selecionado sexo
                name = username.getText();//nome selecionado
                selected = sexBox.getSelectionModel().getSelectedItem();//sexo selecionado
            }

        }
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

    @FXML
    public void quitButtonAction(){
        System.exit(0);
    }
}
