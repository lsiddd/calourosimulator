package com.crapgames.calourosimulator.views;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by lucas on 27/04/16.
 */
public class SplashScreen {
    @FXML ImageView splashImage = new ImageView();

    @FXML private void splashExit(){
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) splashImage.getScene().getWindow();

        Scene scene = null;
        try {
            scene = new Scene(mm.mainMenu());
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(scene);
        stage.show();
    }
}
