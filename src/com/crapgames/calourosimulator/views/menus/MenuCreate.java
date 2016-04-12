package com.crapgames.calourosimulator.views.menus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

    @FXML
    ComboBox sexBox = new ComboBox();

    @FXML
    Button goBack = new Button();

    private static  Scene mCreate;

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
    private void chooseSexButton(){
        Object selected = sexBox.getSelectionModel().getSelectedItem();
        System.out.println(selected);
    }

    @FXML
    private void mainButton() throws IOException{
        Stage stage;
        Parent root;

        stage = (Stage) goBack.getScene().getWindow();

        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void quitButtonAction(){
        System.exit(0);
    }
}
