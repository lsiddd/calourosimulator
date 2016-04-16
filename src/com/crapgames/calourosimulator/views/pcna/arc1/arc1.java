package com.crapgames.calourosimulator.views.pcna.arc1;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by lucas on 16/04/16.
 */
public class arc1 {

    @FXML
    Button math = new Button();
    @FXML
    Button physics = new Button();
    @FXML
    Button quemistry = new Button();

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
