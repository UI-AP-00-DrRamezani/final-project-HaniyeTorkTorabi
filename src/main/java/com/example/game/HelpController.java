package com.example.game;

import com.example.game.MainClasses.Student.Stu_Bag;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelpController {

    @FXML
    private Button btn_Back;

    @FXML
    private ImageView img_StuBag;

    @FXML
    private ImageView img_StuCoffee;

    @FXML
    private ImageView img_StuMusic;

    @FXML
    private ImageView img_StuPhone;

    @FXML
    private ImageView img_TABag;

    @FXML
    private ImageView img_TAHappy;

    @FXML
    private ImageView img_TAMusic;

    @FXML
    private ImageView img_TAPhone;

    @FXML
    void click_Back(MouseEvent event) throws IOException {

        Parent parent = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

}
