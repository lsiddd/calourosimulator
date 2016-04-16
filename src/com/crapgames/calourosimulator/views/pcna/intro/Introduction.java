package com.crapgames.calourosimulator.views.pcna.intro;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import com.crapgames.calourosimulator.controller.DbSaver;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
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

        Media sound = new Media(new File("src/com/crapgames/calourosimulator/assets/sounds/Pacman.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

        if (select == 1)
            text1.setText(texto2);
        else if (select == 2) {
            stage = (Stage) imgClick.getScene().getWindow();

            Scene scene = new Scene(mm.arc1());
            stage.setScene(scene);
            stage.show();
        }
    }
}
