package com.example.game;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.*;

public class SettingController implements Initializable {

    @FXML
    private static ToggleGroup Levels;

    @FXML
    private  RadioButton Radio_EASY;

    @FXML
    private  RadioButton Radio_HARD;

    @FXML
    private  RadioButton Radio_NORMAL;

    @FXML
    private Button btn_Back;

    @FXML
    private Button btn_Save;

    @FXML
    private ImageView img_Setting;

    @FXML
    private Label lblMouseSpeed;

    @FXML
    private Label lblVolume;

    @FXML
    private Label lbl_levels;

    @FXML
    private Label lbl_mouseSpeed;

    @FXML
    private Label lbl_volume;

    @FXML
    private Slider mouse_slider1;

    @FXML
    private AnchorPane pane_setting;

    @FXML
    private Slider voloum_Slider;

    @FXML
    void action_Levels(ActionEvent event) {     //Choose Level
        if(Radio_EASY.isSelected())
            GamePageController.setLevel(8);
        else if(Radio_NORMAL.isSelected())
            GamePageController.setLevel(5);
        else if(Radio_HARD.isSelected())
            GamePageController.setLevel(3);
    }

    @FXML
    void click_Back(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void click_Save(MouseEvent event) {

        JOptionPane.showMessageDialog(null, "Setting Changed!");
    }

    int volume;
    int mouseSpeed;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        voloum_Slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

                volume = (int) voloum_Slider.getValue();
                lblVolume.setText(Integer.toString(volume) + "%");
            }
        });

        mouse_slider1.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

                mouseSpeed = (int) mouse_slider1.getValue();
                lblMouseSpeed.setText(Integer.toString(mouseSpeed) + "%");
            }
        });
       btn_Save.setOnAction(this::action_Levels);    // send level of game to class GamePageController
    }

}