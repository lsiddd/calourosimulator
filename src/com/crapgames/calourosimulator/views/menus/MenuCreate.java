package com.crapgames.calourosimulator.views.menus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * Created by lucas on 07/04/16.
 */
public class MenuCreate {
    @FXML
    TextField username = new TextField();

    @FXML
    PasswordField passwd = new PasswordField();

    private static  Scene mCreate;

    public Scene menuCreate() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuCreate.fxml"));
        mCreate = new Scene(root);
        return MenuCreate.mCreate;
    }
    /*
    * SALVAR OS BUFFERS DOS TEXTFIELD PARA BANCO DE DADOS OU ARQUIVO DE TEXTO
    */
    @FXML
    private void writeBuffers(){
        if ((username.getText() != null && !username.getText().isEmpty()))
            /*Salvar o username.getText() na database*/
        if(passwd.getText() != null && !passwd.getText().isEmpty())
            /*salvar o passwd.getText() na database*/
    }

    @FXML
    public void quitButtonAction(){
        System.exit(0);
    }
}
