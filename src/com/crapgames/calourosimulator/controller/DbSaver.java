package com.crapgames.calourosimulator.controller;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by lucas on 12/04/16.
 *
 * Classe que vai manipular as databases
 * */
public class DbSaver {

    public void setSave(String name, Object orientacao, Object notaEnem) throws IOException{
        PrintWriter writer = new PrintWriter("src/com/crapgames/calourosimulator/saves/" + name + ".profile");

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
    public void setLvl(int lvl, String name) throws IOException{
        PrintWriter set = new PrintWriter("src/com/crapgames/calourosimulator/saves/" + name + "Lvl.profile");
        set.print(lvl);
        set.close();
    }
    public String getLvl(String fileName) throws IOException{
        String classe;
        InputStream fis = new FileInputStream("src/com/crapgames/calourosimulator/saves/" + fileName + "Lvl.profile");
        InputStreamReader ist = new InputStreamReader(fis, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(ist);
        return classe = br.readLine();
    }
    public void setCurrent(String name) throws IOException{
        PrintWriter set = new PrintWriter("src/com/crapgames/calourosimulator/saves/current");
        set.print(name);
        set.close();
    }
    public String getCurrent() throws IOException{
        String current;
        InputStream fis = new FileInputStream("src/com/crapgames/calourosimulator/saves/current");
        InputStreamReader ist = new InputStreamReader(fis, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(ist);
        return current = br.readLine();
    }
}
