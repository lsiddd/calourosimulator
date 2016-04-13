package com.crapgames.calourosimulator.views.menus;

import com.crapgames.calourosimulator.controller.dbSaver;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

    @FXML
    Button juhButton = new Button();

    @FXML
    ComboBox enemNota = new ComboBox();

    @FXML
    private void writeBuffers() throws IOException{
        if ((username.getText() != null && !username.getText().isEmpty())){//deve ser selecionado um nome

            if (sexBox.getSelectionModel().getSelectedItem() != null) {//deve ser selecionado sexo
                dbSaver saver = new dbSaver();
                saver.setSave(username.getText(),sexBox.getSelectionModel().getSelectedItem(), enemNota.getSelectionModel().getSelectedItem());
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
    public void quitButtonAction() throws IOException{
        System.exit(0);
    }
}
