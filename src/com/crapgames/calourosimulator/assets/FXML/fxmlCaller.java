package com.crapgames.calourosimulator.assets.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Created by lucas on 15/04/16.
 */
public class fxmlCaller {
    public  Parent introduction() throws IOException{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Introduction.fxml"));

        return root;
    }
    public  Parent lost() throws IOException{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Lost.fxml"));

        return root;
    }
    public  Parent menuCreate() throws IOException{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("MenuCreate.fxml"));

        return root;
    }
    public  Parent about() throws IOException{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("About.fxml"));

        return root;
    }
    public  Parent mainMenu() throws IOException{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

        return root;
    }
    public  Parent introduction2() throws IOException{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Introduction2.fxml"));

        return root;
    }
}
