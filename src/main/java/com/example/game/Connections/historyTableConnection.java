package com.example.game.Connections;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class historyTableConnection {

    public static void insertTable(int TANumbers, int TAScore, int StuNumber, int StuScore) throws Exception {

        String sqlCmd = String.format("INSERT INTO `gamehistory` (`GameID`, `NumberTAPlayer`, `TAScores`, `NumberSTuPlayer`, `StudentScores`) VALUES ('%d', '%d', '%d', '%d', '%d')", getGameMaxID() + 1, TANumbers, TAScore, StuNumber, StuScore);
        MainConnection.ExecuteSQL(sqlCmd);
    }

    public static int getGameMaxID() throws Exception {
        String sqlCmd = "SELECT MAX(`GameID`) FROM `gamehistory`";
        ResultSet resultSet = MainConnection.ExecuteQuery(sqlCmd);

        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return 0;
    }

    public static DefaultTableModel loadTelevision() throws Exception {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("GameID");
        defaultTableModel.addColumn("NumberTAPlayer");
        defaultTableModel.addColumn("TAScores");
        defaultTableModel.addColumn("NumberSTuPlayer");
        defaultTableModel.addColumn("StudentScores");

        String sqlCmd = "SELECT `GameID`, `NumberTAPlayer`, `TAScores`, `NumberSTuPlayer`, `StudentScores` FROM `gamehistory`";
        ResultSet resultSet = MainConnection.ExecuteQuery(sqlCmd);

        while (resultSet.next()) {
            int GameID = Integer.parseInt(resultSet.getString("GameID"));
            int NumberTAPlayer = Integer.parseInt(resultSet.getString("NumberTAPlayer"));
            int TAScores = Integer.parseInt(resultSet.getString("TAScores"));
            int NumberSTuPlayer = Integer.parseInt(resultSet.getString("NumberSTuPlayer"));
            int StudentScores = Integer.parseInt(resultSet.getString("StudentScores"));

            defaultTableModel.addRow(new String[]{String.valueOf(GameID), String.valueOf(NumberTAPlayer), String.valueOf(TAScores), String.valueOf(NumberSTuPlayer), String.valueOf(StudentScores)});
        }
        return defaultTableModel;
    }
}

