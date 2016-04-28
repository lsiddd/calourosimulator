package com.crapgames.calourosimulator.viewsControl;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Transition;
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

    @FXML private void starts(){
         switch(aux) {

             case 0:
                 String text = "arraste o mouse para continuar...";
                 transition();

                 final Animation animation = new Transition() {
                     {
                         setCycleDuration(Duration.millis(3000));
                     }

                     protected void interpolate(double frac) {
                         final int length = text.length();
                         final int n = Math.round(length * (float) frac);
                         SplashText.setText(text.substring(0, n));
                     }

                 };
                 animation.play();
                 aux ++;
                 break;

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
