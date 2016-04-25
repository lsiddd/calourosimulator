package com.crapgames.calourosimulator.library;

import java.io.File;
import java.io.IOException;

/**
 * calourosimulator
 * Created by Marcos (merkkp@gmail.com) on 4/14/16.
 * Classe responsável pelos arquivos de configuração.
 */
public class Config {
    /**
     * @return The path to the configuration folder of the game.
     */
    private static String getConfigFolder() {

        String userDirectory = System.getProperty("user.dir");
        String configFolder = userDirectory + "/.calourosimulator/";

        return configFolder;
    }

    /**
     * @return The path to the .db file used to store user info.
     */
    private static String getDatabaseFile() {
        return Config.getConfigFolder() + "calourosimulator.db";
    }

    /**
     * @param name Name of the character.
     *
     * @return Path to character specific file.
     */
    private static String getProfileFile(String name) {
        return Config.getConfigFolder() + name + ".profile";
    }

    private static boolean isProfileFileCreated(String name) {
        return (new File(Config.getProfileFile(name)).exists());
    }

    private static boolean isConfigFolderCreated() {
        return (new File(Config.getConfigFolder()).exists());
    }

    private static boolean isDatabaseFileCreated() {
        return (new File(Config.getDatabaseFile()).exists());
    }

    /**
     * @throws IOException
     *
     * Create folder is not exists.
     */
    public void createConfigFolder() throws IOException {
        if (!Config.isConfigFolderCreated()) {
            File configFolder = new File(Config.getConfigFolder());
            configFolder.mkdir();
        }
    }

    /**
     * @throws IOException
     *
     * Create database file if not exists.
     */
    public void createDatabaseFile() throws IOException {
        this.createConfigFolder();
        if (!Config.isDatabaseFileCreated()) {
            File databaseFile = new File(Config.getDatabaseFile());
            databaseFile.createNewFile();
        }
    }

    /**
     * @param name Name of the character.
     *
     * @throws IOException
     *
     * Create profile file if not exists.
     */
    public void createProfileFile(String name) throws IOException {
        this.createConfigFolder();
        if (!Config.isProfileFileCreated(name)) {
            File profileFile = new File(Config.getProfileFile(name));
            profileFile.createNewFile();
        }
    }

    /**
     * @return Database path, if exists, else returns null.
     */
    public String getDatabase() {
        if (Config.isDatabaseFileCreated())
            return Config.getDatabaseFile();
        return null;
    }

    /**
     * @param name Name of the character.
     *
     * @return Path to the character profile file, if exists.
     */
    public String getProfile(String name) {
        if (Config.isProfileFileCreated(name))
            return Config.getProfileFile(name);
        return null;
    }

}
