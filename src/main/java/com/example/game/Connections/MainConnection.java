package com.example.game.Connections;

import java.sql.*;

public class MainConnection {

    public static String URL = "jdbc:mysql://localhost/game";
    public static String username = "root";
    public static String password = "@3084314";

    public static void ExecuteSQL(String sqlCmd) throws Exception {


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, username, password);

        Statement statement = connection.prepareStatement(sqlCmd);
        statement.execute(sqlCmd);

        connection.close();

    }

    public static ResultSet ExecuteQuery(String sqlCmd) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, username, password);

        Statement statement = connection.prepareStatement(sqlCmd);
        ResultSet resultSet = statement.executeQuery(sqlCmd);

        return resultSet;
    }
}