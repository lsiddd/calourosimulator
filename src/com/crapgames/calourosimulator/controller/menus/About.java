package com.crapgames.calourosimulator.controller.menus;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import com.crapgames.calourosimulator.views.fxmlCaller;

import java.io.IOException;

/**
 * Created by lucas on 12/04/16.
 */
public class About {

    @FXML
    ImageView bkImg = new ImageView();

    @FXML
    private void mainButton() throws IOException{//se a img for clicada voltar pro menu principal
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) bkImg.getScene().getWindow();

        Scene scene = new Scene(mm.mainMenu());
        stage.setScene(scene);
        stage.show();
    }

}
