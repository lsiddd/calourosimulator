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
        if(Integer.valueOf(see.getLvl(see.getCurrent())) == 1)
            return FXMLLoader.load(getClass().getResource("Introduction.fxml"));

        else
            return FXMLLoader.load(getClass().getResource("arc1-1.fxml"));
    }

    public  Parent introduction() throws IOException{
        return FXMLLoader.load(getClass().getResource("Introduction.fxml"));
    }

    public  Parent lost() throws IOException{
        return FXMLLoader.load(getClass().getResource("menus/Lost.fxml"));
    }

    public  Parent menuCreate() throws IOException{
        return FXMLLoader.load(getClass().getResource("menus/MenuCreate.fxml"));
    }

    public  Parent about() throws IOException{
        return FXMLLoader.load(getClass().getResource("menus/About.fxml"));
    }

    public  Parent mainMenu() throws IOException{
        return FXMLLoader.load(getClass().getResource("menus/MainMenu.fxml"));
    }

    public Parent mathScene() throws IOException{
        return FXMLLoader.load(getClass().getResource("arc1/math.fxml"));
    }

    public Parent phyScene() throws IOException{
        return FXMLLoader.load(getClass().getResource("arc1/physicScene.fxml"));
    }

    public Parent qmcScene() throws IOException{
        return FXMLLoader.load(getClass().getResource("arc1/qmc/qmcScene.fxml"));
    }

    public Parent qmcScene1() throws IOException{
        return FXMLLoader.load(getClass().getResource("arc1/qmc/qmcScene-1.fxml"));
    }

    public Parent splashScreen() throws IOException{
        return FXMLLoader.load(getClass().getResource("SplashScene.fxml"));
    }

    public Parent endGame() throws IOException{
        return FXMLLoader.load(getClass().getResource("EndGame.fxml"));
    }
}
