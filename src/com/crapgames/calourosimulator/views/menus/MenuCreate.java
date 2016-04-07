package com.crapgames.calourosimulator.views.menus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

/**
 * Created by lucas on 07/04/16.
 */
public class MenuCreate {
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

    }

    @FXML
    private void saveUsernameBuffer(){

    }

    @FXML
    private void savePasswdBuffer(){

    }

    @FXML
    public void quitButtonAction(){
        System.exit(0);
    }
}
