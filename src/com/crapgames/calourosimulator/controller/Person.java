package com.crapgames.calourosimulator.controller;

import java.io.IOException;

/**
 * Created by lucas on 18/04/16.
 */
public class Person {
    String name;
    String nota;
    String classe;
    int cargaHoraria;
    int faltas;

    public Person(String nome) throws IOException{
        DbSaver getter = new DbSaver();
        this.name = nome;
        this.nota = getter.getNota("src/com/crapgames/calourosimulator/saves/" +name+".profile");
        this.classe = getter.getClasse("src/com/crapgames/calourosimulator/saves/" +name+".profile");
        this.cargaHoraria = 10;
        this.faltas = 0;

    }

}
