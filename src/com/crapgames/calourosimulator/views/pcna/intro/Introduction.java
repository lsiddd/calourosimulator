package com.crapgames.calourosimulator.views.pcna.intro;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by lucas on 12/04/16.
 * primeira scene após a criação de personagem
 **/
public class Introduction {
    static int select= 0;
    int i = 0;
    String texto1 = "No príncipio era o alfabeto simples e perfeito: A, B, C , D, E ... onde todos haviam de enfrentar de revisar a Matemática, Física e Química de seu ensino médio, e o destino havia de reservar algo de mais de especial, mais diferenciado para a turma C";
    String texto2 = "composta por Engenharias da Computação, Alimentos e Materiais, a qual evoluiu para Cassino C ++ em função do alto nivel de zoação com Alimentos e Materiais, e não menos importante os jogos!";

    @FXML
    Text text1 = new Text();

    @FXML
    ImageView imgClick = new ImageView();

    @FXML
    private void change() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Introduction call = new Introduction();
        this.select++;
        Stage stage;

        if(select == 1)
            text1.setText(texto1);
        else if (select == 2)
            text1.setText(texto2);
        else if(select == 3) {

            stage = (Stage) imgClick.getScene().getWindow();

            Scene scene = new Scene(mm.arc1());
            stage.setScene(scene);
            stage.show();
        }
    }
}
