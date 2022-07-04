package com.example.game;

import com.example.game.MainClasses.Hero;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class GamePage extends Parent {
    public static Pane root = new Pane();

    public GamePage() throws IOException {
        Stage stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("GamePage.fxml"));
        Scene scene = new Scene(root);
        Image mainIcone = new Image("D:\\Unversity\\Term 2\\project pishrafte\\Game\\src\\main\\java\\com\\example\\game\\icones\\icone.png");
        stage.getIcons().add(mainIcone);
        stage.setResizable(false);
        stage.setTitle("STUDENT vs TA");
        stage.setScene(scene);
        stage.show();


        root.getChildren().add(TAScore);
        TAScore.setLayoutX(463);
        TAScore.setLayoutY(132);
        TAScore.setText("--");

        root.getChildren().add(STUScore);
        STUScore.setLayoutX(463);
        STUScore.setLayoutY(165);
        STUScore.setText("--");
    }

    static Label TAScore = new Label();
    static Label STUScore = new Label();

    static int TAScores = 0;
    static int StudentScores = 0;


    public static void startGame() {
        int scoreWin = (GamePageController.playGroundHeroesTA.size() * 10);

        for (Hero hero : GamePageController.playGroundHeroesStu) {

            for (Hero hero1 : GamePageController.playGroundHeroesTA) {

                if (hero.Target(hero1)) {
                    while (hero.getHealth() > 0 && hero1.getHealth() > 0) {

                        hero.setHealth(hero.getHealth() - hero1.getPower());
                        hero1.setHealth(hero1.getHealth() - hero.getPower());

                        if (hero.getHealth() <= 0) {

                            root.getChildren().remove(hero.getImageView());
                            hero1.getImageView().setLayoutX(hero1.getImageView().getLayoutX() - (hero1.getSpeed() / 100));
                            TAScores = TAScores + 10;
                            TAScore.setText(String.valueOf(TAScores));

                        }
                        if (hero1.getHealth() <= 0) {
                            root.getChildren().remove(hero1.getImageView());
                            hero.getImageView().setLayoutX((hero.getImageView().getLayoutX() + (hero.getSpeed() / 100)));
                            StudentScores = StudentScores + 10;
                            STUScore.setText(String.valueOf(StudentScores));
                        }
                    }
                }

                if (hero.getImageView().getLayoutX() > 750) {
                    hero.getImageView().setLayoutX((hero.getImageView().getLayoutX()));
                }

                if (hero1.getImageView().getLayoutX() <= 155) {
                    GamePageController.timer.stop();
                    JOptionPane.showMessageDialog(null, "TEAM TA WON");

                }
                if (StudentScores == scoreWin) {
                    hero1.getImageView().setVisible(false);
                    GamePageController.timer.stop();
                    JOptionPane.showMessageDialog(null, "TEAM STUDENT WON");

                } else {

                    if (hero.getImageView().getLayoutX() > 750) {
                        hero.getImageView().setLayoutX((hero.getImageView().getLayoutX()));
                    } else {
                        hero.getImageView().setLayoutX((hero.getImageView().getLayoutX() + (hero.getSpeed() / 100)));
                    }

                    hero1.getImageView().setLayoutX(hero1.getImageView().getLayoutX() - (hero1.getSpeed() / 100));

                }

            }

        }

    }

}
