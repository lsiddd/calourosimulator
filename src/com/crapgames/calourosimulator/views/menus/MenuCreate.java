package com.crapgames.calourosimulator.views.menus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.*;

import java.io.IOException;

/**
 * Created by lucas on 07/04/16.
 */
public class MenuCreate {
    @FXML
    TextField username = new TextField();

    @FXML
    PasswordField passwd = new PasswordField();

    private static  Scene mCreate;

    ObservableList <String> options =
            FXCollections.observableArrayList(
                    "Masculino",
                    "Feminino",
                    "Transexual",
                    "Assexuado",
                    "Berg",
                    "Todas as Opções"
            );

    @FXML
    ComboBox sexBox = new ComboBox(options);

    public Scene menuCreate() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuCreate.fxml"));
        mCreate = new Scene(root);
        return MenuCreate.mCreate;
    }

    @FXML
    private void writeBuffers(){
        if ((username.getText() != null && !username.getText().isEmpty())){}
            /*Salvar o username.getText() na database*/
        if(passwd.getText() != null && !passwd.getText().isEmpty()){}
            /**
            * salvar o passwd.getText() na database
            * AINDA NÃO FUNCIONAL
            * vamo que vamo
            **/
   /*     Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE PLAYERS " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAME           TEXT    NOT NULL, " +
                    " PSWD            INT     NOT NULL, )";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }*/
    }

    @FXML
    public void quitButtonAction(){
        System.exit(0);
    }
}
