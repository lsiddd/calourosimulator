package com.crapgames.calourosimulator.assets.FXML;

import com.crapgames.calourosimulator.controller.DbSaver;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Created by lucas on 15/04/16.
 */
public class fxmlCaller {
    DbSaver see = new DbSaver();
    public Parent select() throws IOException{
        if(see.getLvl(see.getCurrent()) == "1")
            return FXMLLoader.load(getClass().getResource("Introduction.fxml"));
        else /*(see.getLvl(see.getCurrent()) == "2")*/
            return FXMLLoader.load(getClass().getResource("arc1-1.fxml"));
    }
    public  Parent introduction() throws IOException{
        return FXMLLoader.load(getClass().getResource("Introduction.fxml"));
    }

    public  Parent lost() throws IOException{
        return FXMLLoader.load(getClass().getResource("Lost.fxml"));
    }

    public  Parent menuCreate() throws IOException{
        return FXMLLoader.load(getClass().getResource("MenuCreate.fxml"));
    }

    public  Parent about() throws IOException{
        return FXMLLoader.load(getClass().getResource("About.fxml"));
    }

    public  Parent mainMenu() throws IOException{
        return FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
    }

    public Parent arc1() throws IOException{
        return FXMLLoader.load(getClass().getResource("arc1-1.fxml"));
    }

}
