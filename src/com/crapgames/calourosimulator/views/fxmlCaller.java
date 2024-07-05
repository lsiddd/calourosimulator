package com.crapgames.calourosimulator.views;

import com.crapgames.calourosimulator.model.DbSaver;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class fxmlCaller {
    DbSaver see = new DbSaver();

    public Parent select() throws IOException {
        if (Integer.valueOf(see.getLvl(see.getCurrent())) == 1)
            return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/Introduction.fxml"));
        else
            return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/arc1-1.fxml"));
    }

    public Parent introduction() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/Introduction.fxml"));
    }

    public Parent lost() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/menus/Lost.fxml"));
    }

    public Parent menuCreate() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/menus/MenuCreate.fxml"));
    }

    public Parent about() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/menus/About.fxml"));
    }

    public Parent mainMenu() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/menus/MainMenu.fxml"));
    }

    public Parent mathScene() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/arc1/math.fxml"));
    }

    public Parent phyScene() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/arc1/physicScene.fxml"));
    }

    public Parent qmcScene() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/arc1/qmc/qmcScene.fxml"));
    }

    public Parent qmcScene1() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/arc1/qmc/qmcScene-1.fxml"));
    }

    public Parent splashScreen() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/SplashScene.fxml"));
    }

    public Parent endGame() throws IOException {
        return FXMLLoader.load(getClass().getResource("/com/crapgames/calourosimulator/views/EndGame.fxml"));
    }
}
