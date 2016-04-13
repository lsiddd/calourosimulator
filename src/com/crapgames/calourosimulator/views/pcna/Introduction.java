package com.crapgames.calourosimulator.views.pcna;

import com.crapgames.calourosimulator.controller.dbSaver;

import java.io.IOException;

/**
 * Created by lucas on 12/04/16.
 * primeira scene após a criação de personagem
 **/
public class Introduction {
    private String playerName;
    private String conceito;
    public Introduction(String playerName) throws IOException{
        dbSaver read = new dbSaver();
        this.playerName = playerName;
        this.conceito = read.getNota(playerName + ".profile");
    }
}
