package com.example.game;

import com.example.game.Connections.historyTableConnection;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class MainPageController {

    @FXML
    private Button btn_PlayerInfo;

    @FXML
    private Button btn_load;

    @FXML
    private Button btn_setting;

    @FXML
    private Button btn_start;

    @FXML
    private Label lblMainPage;

    @FXML
    private ImageView pane_mainPage;

    @FXML
    void click_load(MouseEvent event) throws Exception {

        JFrame frame = new JFrame();
        JTable table = new JTable();
        JScrollPane jScrollPane = new JScrollPane(table);
        frame.add(jScrollPane);
        frame.setSize(700, 300);
        frame.setVisible(true);
        table.setModel(historyTableConnection.loadTelevision());
        //frame.pack();
    }

    @FXML
    void click_setting(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(new SettingPage());
        stage.setScene(scene);
       stage.close();

    }


    @FXML
    void click_start(MouseEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(new GamePage());
        stage.setScene(scene);
        stage.close();

    }

    @FXML
    void click_playerInfo(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(new Help());
        stage.setScene(scene);
        stage.close();
    }



}
