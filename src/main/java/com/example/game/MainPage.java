package com.example.game;

import com.example.game.Connections.PlayerConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPage extends Application {
    public static Pane root = new Pane();

    @Override
    public void start(Stage stage) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        Scene scene = new Scene(root);
        Image mainIcone = new Image("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\icone.png");
        stage.getIcons().add(mainIcone);
        stage.setResizable(false);
        stage.setTitle("STUDENT vs TA");
        stage.setScene(scene);
        stage.show();

    }

    public MainPage() throws Exception {
        PlayerConnection.insertPlayer("Bag Student",100,50,300,"Student");
        PlayerConnection.insertPlayer("Phone Student",50,50,150,"Student");
        PlayerConnection.insertPlayer("Music Student",50,150,350,"Student");
        PlayerConnection.insertPlayer("Coffee Student",100,100,400,"Student");

        PlayerConnection.insertPlayer("Happy TA",100,150,400,"TA");
        PlayerConnection.insertPlayer("Bag TA",100,50,300,"TA");
        PlayerConnection.insertPlayer("Phone TA",75,125,200,"TA");
        PlayerConnection.insertPlayer("Music TA",50,150,350,"TA");

    }
}
