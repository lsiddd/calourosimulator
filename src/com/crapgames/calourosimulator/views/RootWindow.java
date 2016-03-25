package com.crapgames.calourosimulator.views;

import javafx.scene.Group;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 */
public class RootWindow {

    public static String title;
    public static double width, height;
    private static Group rootWindowGroup;

    public RootWindow(String title, double width, double height) {
        RootWindow.title = title;
        RootWindow.rootWindowGroup = new Group();
        RootWindow.width = width;
        RootWindow.height = height;
    }

}
