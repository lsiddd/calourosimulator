package com.crapgames.calourosimulator.controller;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by lucas on 12/04/16.
 *
 * Classe que vai manipular as databases
 * */
public class dbSaver {

    public void setSave(String name, Object orientacao, Object notaEnem) throws IOException{
        PrintWriter writer = new PrintWriter(name + ".profile");

        writer.println(orientacao);

        writer.println(notaEnem);

        writer.close();
    }

    public String getNota(String fileName) throws IOException{
        String classe;
        InputStream fis = new FileInputStream(fileName);
        InputStreamReader ist = new InputStreamReader(fis, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(ist);
        br.readLine();
        return classe = br.readLine();
    }

    public String getClasse(String fileName) throws IOException{
        String classe;
        InputStream fis = new FileInputStream(fileName);
        InputStreamReader ist = new InputStreamReader(fis, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(ist);
        return classe = br.readLine();
    }
}
