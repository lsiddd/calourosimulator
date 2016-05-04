package com.crapgames.calourosimulator.controller.menus;

import com.crapgames.calourosimulator.views.fxmlCaller;
import com.crapgames.calourosimulator.model.DbSaver;
import javafx.fxml.FXML;
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
    Button createStuff = new Button();

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
        DbSaver saver = new DbSaver();
        if ((username.getText() != null && !username.getText().isEmpty())){//deve ser selecionado um nome

            if (sexBox.getSelectionModel().getSelectedItem() != null) {//deve ser selecionado sexo
                saver.setSave(username.getText(),sexBox.getSelectionModel().getSelectedItem().toString(), enemNota.getSelectionModel().getSelectedItem());
                saver.setLvl(1, username.getText());
                start();
            }

        }
    }

    @FXML
    public void mainButton() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) goBack.getScene().getWindow();

        Scene scene = new Scene(mm.mainMenu());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void quitButtonAction() throws IOException{
        System.exit(0);
    }

    public void start() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) createStuff.getScene().getWindow();

        Scene scene = new Scene(mm.introduction());
        stage.setScene(scene);
        stage.show();
    }
}
