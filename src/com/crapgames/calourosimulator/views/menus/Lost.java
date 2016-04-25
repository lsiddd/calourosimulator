package com.crapgames.calourosimulator.views.menus;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by lucas on 13/04/16.
 */
public class Lost {
    @FXML
    ImageView lostImg = new ImageView();

    @FXML
    private void mainButton() throws IOException{//se a img for clicada voltar pro menu principal
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) lostImg.getScene().getWindow();

        Scene scene = new Scene(mm.mainMenu());
        stage.setScene(scene);
        stage.show();
    }
}
