package com.crapgames.calourosimulator.views.menus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 3/25/16.
 */
public class MainMenu{

    private static  Scene mainMenu;

    private String user;

    @FXML
    TextField userCheck = new TextField();

    @FXML
    PasswordField pswdCheck = new PasswordField();

    @FXML
    Button juhButton = new Button();


    public Scene MainMenu() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        mainMenu = new Scene(root);
        return MainMenu.mainMenu;
    }

    @FXML
    private void checkAndStart(){
        if ((userCheck.getText() != null && !userCheck.getText().isEmpty())){}
            /*Aqui vai ser comparado o campo de username com o que estiver cadastrado*/
        if(pswdCheck.getText() != null && !pswdCheck.getText().isEmpty()){}
            /*Aqui sai ser comparado o campo de senha com o que estiver salvo*/
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.crapgames.calourosimulator.views.menus.MainMenu");
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
        }
    }

    @FXML
    public void quitButtonAction(){
        System.exit(0);
    }

    @FXML
    private void menuCreate(){
        /*Chamar o menu de criação de personagem e exibi-lo, não sei como*/
    }

    @FXML
    private void juh(){
        System.out.println("Perdi");
    }
}
