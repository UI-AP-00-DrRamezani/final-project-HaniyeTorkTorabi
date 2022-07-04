package com.example.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingPage extends Parent {
    public static Pane root = new Pane();

    public SettingPage() throws IOException {
        Stage stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("Setting.fxml"));
        Scene scene = new Scene(root);
        Image mainIcone = new Image("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\icone.png");
        stage.getIcons().add(mainIcone);
        stage.setResizable(false);
        stage.setTitle("STUDENT vs TA");
        stage.setScene(scene);
        stage.show();
    }

}
