package com.crapgames.calourosimulator.views.menus;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import com.crapgames.calourosimulator.controller.DbSaver;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
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
        DbSaver s = new DbSaver();

        /*Aqui vai ser comparado o campo de username com o que estiver cadastrado*/
        if ((userCheck.getText() != null && !userCheck.getText().isEmpty())){
            File f = new File("src/com/crapgames/calourosimulator/saves/" + userCheck.getText() + ".profile");
                    if(f.exists() && !f.isDirectory()){

                        try {
                            s.setCurrent(userCheck.getText());

                            Media sound = new Media(new File("src/com/crapgames/calourosimulator/assets/sounds/Pacman.mp3").toURI().toString());
                            MediaPlayer mediaPlayer = new MediaPlayer(sound);
                            mediaPlayer.play();

                            fxmlCaller mm = new fxmlCaller();
                            Stage stage;

                            stage = (Stage) userCheck.getScene().getWindow();

                            Scene scene = new Scene(mm.select());
                            stage.setScene(scene);
                            stage.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    else//jogar este texto em uma popup
                        System.out.println("Save não existe, primeiro crie personagem");
        }
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

    public void goToLevel(String player){

    }

}
