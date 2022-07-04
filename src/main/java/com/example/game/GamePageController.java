package com.example.game;

import com.example.game.Connections.PlayerConnection;
import com.example.game.Connections.historyTableConnection;
import com.example.game.MainClasses.Draggable;
import com.example.game.MainClasses.Hero;
import com.example.game.MainClasses.Student.Stu_Bag;
import com.example.game.MainClasses.Student.Stu_Coffee;
import com.example.game.MainClasses.Student.Stu_Music;
import com.example.game.MainClasses.Student.Stu_Phone;
import com.example.game.MainClasses.TA.TA_Bag;
import com.example.game.MainClasses.TA.TA_Happy;
import com.example.game.MainClasses.TA.TA_Music;
import com.example.game.MainClasses.TA.TA_Phone;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class GamePageController implements Initializable {

    public static ArrayList<Hero> playGroundHeroesStu = new ArrayList<>();
    public static ArrayList<Hero> playGroundHeroesTA = new ArrayList<>();

    @FXML
    private ProgressBar Buldingprogressbar;

    @FXML
    private Button btn_Exit;

    @FXML
    private Button btn_Pause;

    @FXML
    private Button btn_Save;

    @FXML
    private Button btn_Start = new Button();

    @FXML
    private ImageView img_ProffRoom;

    @FXML
    private ImageView img_StuBag;

    @FXML
    private ImageView img_StuCoffee;

    @FXML
    private ImageView img_StuMusic;

    @FXML
    private ImageView img_StuPhone;

    @FXML
    static public ImageView img_TABag;

    @FXML
    static public ImageView img_TAHappy;

    @FXML
    static public ImageView img_TAMusic;

    @FXML
    static public ImageView img_TAPhone;

    @FXML
    private Label lbl_NumStuBag;

    @FXML
    private Label lbl_NumStuCoffee;

    @FXML
    private Label lbl_NumStuMusic;

    @FXML
    private Label lbl_NumStuPhone;

    @FXML
    private static Label lbl_StudentScores;

    @FXML
    private static Label lbl_TAScores;

    @FXML
    void action_Pause(ActionEvent event) {
        timer.pause();
    }

    @FXML
    void click_Resume(MouseEvent event) {
        timer.play();
    }

    static Timeline timer;

    public GamePageController() {
        initTimer();
    }

    @FXML
    void click_Start(MouseEvent event) {

        System.out.println("hhhhhh");
        timer.play();

    }

    void initTimer() {

        timer = new Timeline(
                new KeyFrame(
                        Duration.seconds(0.1),
                        e -> GamePage.startGame()
                )
        );
        timer.setCycleCount(Animation.INDEFINITE);
    }

    static int numberOfStudent;

    static public void setLevel(int levels) {
        numberOfStudent = levels;
    }

    static int TAScore;

    static public void setTAScore(int score) {
        TAScore = score;
    }

    static int STUScore;

    static public void setStuScore(int score) {
        STUScore = score;
    }


    //--------------------------------------------------------------
    @FXML
    ImageView img_StuCoffee1 = new ImageView();

    @FXML
    void click_StuCooffee(MouseEvent event) throws Exception {

        int number = Integer.parseInt(lbl_NumStuCoffee.getText());
        lbl_NumStuCoffee.setText(String.valueOf(number));

        if (number == 0) {
            JOptionPane.showMessageDialog(null, "NUMBER OF CHOSEN ITEM IS 0 !");

        } else {
            Stu_Coffee stu_coffee = new Stu_Coffee();
            stu_coffee.setImageView(makeCopy("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\stu4.png", img_StuCoffee1, 156, 103));

            GamePage.root.getChildren().add(stu_coffee);
            playGroundHeroesStu.add(stu_coffee);

            img_StuCoffee1 = new ImageView();

            --number;
            lbl_NumStuCoffee.setText(String.valueOf(number));
        }
    }

    //--------------------------------------------------------------
    @FXML
    ImageView img_StuBag1 = new ImageView();

    @FXML
    void click_StuBag(MouseEvent event) throws Exception {

        int number = Integer.parseInt(lbl_NumStuBag.getText());
        lbl_NumStuBag.setText(String.valueOf(number));

        if (number == 0) {
            JOptionPane.showMessageDialog(null, "NUMBER OF CHOSEN ITEM IS 0 !");

        } else {
            Stu_Bag stu_bag = new Stu_Bag();
            stu_bag.setImageView(makeCopy("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\stu3.png", img_StuBag1, 13, 103));

            GamePage.root.getChildren().add(stu_bag);
            playGroundHeroesStu.add(stu_bag);

            img_StuBag1 = new ImageView();

            --number;
            lbl_NumStuBag.setText(String.valueOf(number));
        }
    }

    //--------------------------------------------------------------
    @FXML
    ImageView img_StuMusic1 = new ImageView();

    @FXML
    void click_StuMusic(MouseEvent event) throws Exception {

        int number = Integer.parseInt(lbl_NumStuMusic.getText());
        lbl_NumStuMusic.setText(String.valueOf(number));

        if (number == 0) {
            JOptionPane.showMessageDialog(null, "NUMBER OF CHOSEN ITEM IS 0 !");

        } else {
            Stu_Music stu_music = new Stu_Music();
            stu_music.setImageView(makeCopy("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\stu2.png", img_StuMusic1, 111, 103));

            GamePage.root.getChildren().add(stu_music);
            playGroundHeroesStu.add(stu_music);

            img_StuMusic1 = new ImageView();

            --number;
            lbl_NumStuMusic.setText(String.valueOf(number));

        }
    }

    //--------------------------------------------------------------
    @FXML
    public static ImageView img_StuPhone1 = new ImageView();

    @FXML
    void click_StuPhone(MouseEvent event) throws Exception {
        int number = Integer.parseInt(lbl_NumStuPhone.getText());
        lbl_NumStuPhone.setText(String.valueOf(number));

        if (number == 0) {
            JOptionPane.showMessageDialog(null, "NUMBER OF CHOSEN ITEM IS 0 !");

        } else {

            Stu_Phone stu_phone = new Stu_Phone();
            stu_phone.setImageView(makeCopy("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\stu1.png", img_StuPhone1, 55, 103));

            GamePage.root.getChildren().add(stu_phone);
            playGroundHeroesStu.add(stu_phone);

            img_StuPhone1 = new ImageView();

            --number;
            lbl_NumStuPhone.setText(String.valueOf(number));

        }
    }

    //-----------------------------------------------------------------------
    public static ImageView makeCopy(String path, ImageView imageView, double x, double y) {

        File file = new File(path);
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
        imageView.setFitWidth(45);
        imageView.setFitHeight(90);
        imageView.setLayoutX(x);
        imageView.setLayoutY(y);

        GamePage.root.getChildren().add(imageView);
        Draggable.Dragg(imageView);

        return imageView;
    }

    //--------------------------------------------------------------
    @FXML
    public static ImageView Img_TAMusic1 = new ImageView();

    @FXML
    void click_TAMusic(MouseEvent event) throws Exception {

        TA_Music ta_music = new TA_Music();
        ta_music.setImageView(makeCopy("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\TA1.png", Img_TAMusic1, 615, 103));

        GamePage.root.getChildren().add(ta_music);
        playGroundHeroesTA.add(ta_music);

        Img_TAMusic1 = new ImageView();

    }

    //--------------------------------------------------------------
    @FXML
    public static ImageView Img_TABag1 = new ImageView();

    @FXML
    void click_TABag(MouseEvent event) throws Exception {
        TA_Bag ta_bag = new TA_Bag();
        ta_bag.setImageView(makeCopy("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\TA4.png", Img_TABag1, 698, 103));

        GamePage.root.getChildren().add(ta_bag);
        playGroundHeroesTA.add(ta_bag);

        Img_TABag1 = new ImageView();
    }

    //--------------------------------------------------------------
    @FXML
    public static ImageView Img_TAHappy1 = new ImageView();

    @FXML
    void click_TAHappy(MouseEvent event) throws Exception {
        TA_Happy ta_happy = new TA_Happy();
        ta_happy.setImageView(makeCopy("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\TA2.png", Img_TAHappy1, 749, 103));

        GamePage.root.getChildren().add(ta_happy);
        playGroundHeroesTA.add(ta_happy);

        Img_TAHappy1 = new ImageView();
    }

    //--------------------------------------------------------------
    @FXML
    public static ImageView Img_TAPhone1 = new ImageView();

    @FXML
    void click_TAPhone(MouseEvent event) throws Exception {
        TA_Phone ta_phone = new TA_Phone();
        ta_phone.setImageView(makeCopy("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\TA3.png", Img_TAPhone1, 651, 103));

        GamePage.root.getChildren().add(ta_phone);
        playGroundHeroesTA.add(ta_phone);

        Img_TAPhone1 = new ImageView();
    }

    //--------------------------------------------------------------

    @FXML
    void click_Exit(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void click_Save(MouseEvent event) throws Exception {
        historyTableConnection.insertTable(playGroundHeroesTA.size(), GamePage.TAScores, playGroundHeroesStu.size(), GamePage.StudentScores);

        JOptionPane.showMessageDialog(null, "Game Saved!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lbl_NumStuPhone.setText(String.valueOf(numberOfStudent));
        lbl_NumStuMusic.setText(String.valueOf(numberOfStudent));
        lbl_NumStuCoffee.setText(String.valueOf(numberOfStudent));
        lbl_NumStuBag.setText(String.valueOf(numberOfStudent));

    }
}
