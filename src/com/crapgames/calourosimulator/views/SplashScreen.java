package com.crapgames.calourosimulator.views;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

/**
 * Created by lucas on 27/04/16.
 */
public class SplashScreen {
    @FXML ImageView splashImage = new ImageView();
    @FXML Text SplashText = new Text();
    int aux = 0;

    @FXML public void splashExit(){
         switch(aux) {
             case 1:
                 aux++;
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
                 break;
             case 0:
                 transition();
                 SplashText.setText("Clique novamente...");
                 aux ++;
                 break;
         }
    }

    @FXML public void setSplashText(String text){
        SplashText.setText(text);
    }

    @FXML public void transition(){
        FadeTransition ft = new FadeTransition(Duration.millis(3000), splashImage);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(4);
        ft.setAutoReverse(true);

        ft.play();
    }
}
