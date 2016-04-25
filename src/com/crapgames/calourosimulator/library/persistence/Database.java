package com.crapgames.calourosimulator.library.persistence;

import com.crapgames.calourosimulator.library.Config;

import java.io.IOException;
import java.sql.*;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 4/14/16.
 * Classe responsável pela comunicação com o banco de dados.
 */
public class Database {

    private Config config;
    private String dbPath;
    private Connection conn;

    public Database() {

        this.config = new Config();
        String filePath = config.getDatabase();

        // try to create the db file
        if (filePath == null) {
            try {
                config.createDatabaseFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            this.dbPath = filePath;
        }

        // try to register the class
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // try to open connection
        try {
            this.conn = DriverManager.getConnection("jdbc:sqlite:" + this.dbPath);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void firstRun() {

        String sql = "CREATE TABLE users(" +
                "       id INT PRIMARY KEY, " +
                        "name TEXT NOT NULL, " +
                        "sex TEXT NOT NULL, " +
                        "grade TEXT NOT NULL)";

        try {
            Statement stmt = this.conn.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            this.conn.commit();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void insertUser(String name, String sex, String grade) {
        String sql = "INSERT INTO users(name, sex, grade) VALUES(?, ?, ?)";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, name);
            stmt.setString(2, sex);
            stmt.setString(3, grade);

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
