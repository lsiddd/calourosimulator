package com.crapgames.calourosimulator.viewsControl.menus;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import com.crapgames.calourosimulator.controller.DbSaver;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 */
public class MainMenu{

    private static  Scene mainMenu;

    @FXML
    Button aboutButton = new Button();

    @FXML
    TextField userCheck = new TextField();

    @FXML
    Button juhButton = new Button();

    @FXML
    Button menuCreate = new Button();

    public Scene MainMenu() throws IOException {
        fxmlCaller call = new fxmlCaller();
        mainMenu = new Scene(call.mainMenu());
        return MainMenu.mainMenu;
    }

    @FXML
    private void checkAndStart(){
        DbSaver save = new DbSaver();

        /*Aqui vai ser comparado o campo de username com o que estiver cadastrado*/
        if ((userCheck.getText() != null && !userCheck.getText().isEmpty())){
            File f = new File("src/com/crapgames/calourosimulator/saves/" + userCheck.getText() + ".profile");
            if(f.exists() && !f.isDirectory()) {
                try {
                    save.setCurrent(userCheck.getText());

                    start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // GAMBIARRA FUDIDA, MAS DEUS PERDOA
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Calouro simulator GRITA NA SUA CARA:");
                alert.setContentText("Save não existe, primeiro crie personagem.");
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Calouro simulator GRITA NA SUA CARA:");
            alert.setContentText("Save não existe, primeiro crie personagem.");
            alert.showAndWait();
        }
    }

    public void start() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) userCheck.getScene().getWindow();

        Scene scene = new Scene(mm.select());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void juh() throws IOException{
            fxmlCaller mm = new fxmlCaller();
            Stage stage;

            stage = (Stage) juhButton.getScene().getWindow();

            Scene scene = new Scene(mm.lost());
            stage.setScene(scene);
            stage.show();
    }
    @FXML
    public void quitButtonAction(){
        System.exit(0);
    }

    @FXML
    private void menuCreate() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) menuCreate.getScene().getWindow();

        Scene scene = new Scene(mm.menuCreate());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void aboutCall() throws IOException{
        fxmlCaller mm = new fxmlCaller();
        Stage stage;

        stage = (Stage) aboutButton.getScene().getWindow();

        Scene scene = new Scene(mm.about());
        stage.setScene(scene);
        stage.show();
    }
}
