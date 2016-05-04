package com.crapgames.calourosimulator.controller.pcna.intro;

import com.crapgames.calourosimulator.views.fxmlCaller;
import com.crapgames.calourosimulator.model.DbSaver;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

/**
 * Created by lucas on 12/04/16.
 * primeira scene após a criação de personagem
 **/
public class Introduction {
    static int select = 0;
    int i = 0;
    String texto2 = "composta por Engenharias da Computação, Alimentos e Materiais, a qual evoluiu para Cassino C ++ em função do alto nivel de zoação com Alimentos e Materiais, e não menos importante os jogos!";

    @FXML
    Text text1 = new Text();

    @FXML
    ImageView imgClick = new ImageView();

    @FXML
    private void change() throws IOException {
        DbSaver goTo = new DbSaver();
        fxmlCaller mm = new fxmlCaller();
        Introduction call = new Introduction();

        this.select++;
        Stage stage;

        if (select == 1)
//            text1.setText(texto2);
        animateText(texto2);
        else if (select == 2) {
            DbSaver up = new DbSaver();
            up.setLvl(2, up.getCurrent());
            stage = (Stage) imgClick.getScene().getWindow();

            Scene scene = new Scene(mm.select());
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML public void animateText(String text){
        final Animation animation = new Transition() {
            {
                setCycleDuration(Duration.millis(4000));
            }

            protected void interpolate(double frac) {
                final int length = text.length();
                final int n = Math.round(length * (float) frac);
                text1.setText(text.substring(0, n));
            }

        };
        animation.play();
    }

    @FXML private void starts(){
        if(i == 0) {
            String text = "No príncipio era o alfabeto simples e perfeito: A, B, C , D, E ... onde todos haviam de enfrentar de revisar a Matemática, Física e Química de seu ensino médio, e o destino havia de reservar algo de mais de especial, mais diferenciado para a turma C";
            final Animation animation = new Transition() {
                {
                    setCycleDuration(Duration.millis(6000));
                }

                protected void interpolate(double frac) {
                    final int length = text.length();
                    final int n = Math.round(length * (float) frac);
                    text1.setText(text.substring(0, n));
                }

            };
            animation.play();
            i++;
        }
        else{}
    }
}
