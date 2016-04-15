package com.crapgames.calourosimulator.views.pcna;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by lucas on 12/04/16.
 * primeira scene após a criação de personagem
 **/
public class Introduction {
    @FXML
    Text text1 = new Text();

    @FXML
    ImageView imgClick = new ImageView();

    @FXML
    private void nextScene() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) imgClick.getScene().getWindow();

        Scene scene = new Scene(mm.introduction2());
        stage.setScene(scene);
        stage.show();
    }
}
