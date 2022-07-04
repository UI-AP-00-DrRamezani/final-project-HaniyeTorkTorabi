package com.example.game.Connections;

import java.sql.ResultSet;

public class PlayerConnection {

    public static void insertPlayer(String name,double power, double speed, double health, String role) throws Exception {
        String sqlCmd = String.format("INSERT INTO `information` (`HeroName`, `Power`, `Speed`, `Health`, `role`) VALUES ('%s', '%f', '%f', '%f', '%s')",name,power,speed,health,role);
        MainConnection.ExecuteSQL(sqlCmd);
    }

}
