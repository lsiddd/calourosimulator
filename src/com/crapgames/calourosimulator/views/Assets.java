package com.crapgames.calourosimulator.views;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 */
public class Assets {

    static String directory = "/com/crapgames/calourosimulator/assets";
    public static String ufpaLogo = directory + "/ufpalogo.png";

    public static Backgrounds getBackgrounds() { return new Backgrounds(); }

}

class Backgrounds extends Assets {

    public Backgrounds() { directory += "/backgrounds"; }
    public static String ru = directory + "/ru.png";

}