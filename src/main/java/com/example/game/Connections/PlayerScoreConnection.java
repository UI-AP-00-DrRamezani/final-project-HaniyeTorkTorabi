package com.example.game.Connections;

public class PlayerScoreConnection {

    public static void insertPlayerScore(String name , int Score , int Rank) throws Exception {

        String sqlCmd = String.format("INSERT INTO `playerscore`(`PlayerName`, `Score`, `Rank`) VALUES ('%s','%d','%d')",name,Score,Rank);
        MainConnection.ExecuteSQL(sqlCmd);
    }
}
