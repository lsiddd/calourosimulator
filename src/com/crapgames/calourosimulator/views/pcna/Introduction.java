package com.crapgames.calourosimulator.views.pcna;

import com.crapgames.calourosimulator.controller.dbSaver;
import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.io.IOException;

/**
 * Created by lucas on 12/04/16.
 * primeira scene após a criação de personagem
 **/
public class Introduction {
    private String playerName;
    private String conceito;

    @FXML
    Text text1 = new Text();

    /*public Introduction(String playername) throws IOException{
        dbSaver read = new dbSaver();
        this.playerName = playerName;
        this.conceito = read.getNota(playerName + ".profile");
    }*/

    @FXML
    private void text1Show(){

    }
}
