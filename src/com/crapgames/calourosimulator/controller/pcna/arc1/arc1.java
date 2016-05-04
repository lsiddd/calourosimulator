package com.crapgames.calourosimulator.controller.pcna.arc1;

import com.crapgames.calourosimulator.views.fxmlCaller;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

/**
 * Created by lucas on 16/04/16.
 */
public class arc1 {

    @FXML Button math = new Button();
    @FXML Button physics = new Button();
    @FXML Button quemistry = new Button();
    @FXML Text textArc1 = new Text();

    int i = 0;

    @FXML private void starts(){
        if (i == 0) {
            String text = "Aqui começa sua jornada, voce deve completar os três desafios de física, química e matemática antes do final do PCNA(Programa de Como Nao Aprender) e assegurar sua carga horaria. Com qual começar?";
            final Animation animation = new Transition() {
                {
                    setCycleDuration(Duration.millis(6000));
                }

                protected void interpolate(double frac) {
                    final int length = text.length();
                    final int n = Math.round(length * (float) frac);
                    textArc1.setText(text.substring(0, n));
                }

            };
            animation.play();
            i++;
        }
    }

    @FXML
    private void mathButton() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) math.getScene().getWindow();

        Scene scene = new Scene(mm.mathScene());
        stage.setScene(scene);
    }

    @FXML
    private void phyButton() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) physics.getScene().getWindow();

        Scene scene = new Scene(mm.phyScene());
        stage.setScene(scene);
    }

    @FXML
    private void qmcButton() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) quemistry.getScene().getWindow();

        Scene scene = new Scene(mm.qmcScene());
        stage.setScene(scene);
    }
}
