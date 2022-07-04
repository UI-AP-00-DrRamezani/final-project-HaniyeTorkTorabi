package com.example.game.MainClasses;

import com.example.game.Connections.PlayerConnection;
import javafx.scene.image.ImageView;

public class Hero extends ImageView {

    private double power;
    private double speed;
    private double health;
    private String role;
    public static int personsID = 0;
    ImageView imageView = new ImageView();
    double nX;
    double nY;


    public Hero(double power, double speed, double health, String role) throws Exception {
        this.power = power;
        this.speed = speed;
        this.health = health;
        this.role = role;
    }

    public static int getPersonsID() {
        return personsID;
    }

    public static void setPersonsID(int personsID) {
        Hero.personsID = personsID;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public double getnX() {
        return nX;
    }

    public void setnX(double nX) {
        this.nX = nX;
    }

    public double getnY() {
        return nY;
    }

    public void setnY(double nY) {
        this.nY = nY;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "power=" + power +
                ", speed=" + speed +
                ", health=" + health +
                ", role='" + role + '\'' +
                ", imageView=" + imageView +
                "} " + super.toString();
    }


    public boolean Target(Hero hero) {
        if ((Math.abs(this.getImageView().getLayoutX() - hero.getImageView().getLayoutX() )< 30)&& (Math.abs(this.getImageView().getLayoutY() - hero.getImageView().getLayoutY())<100))
            return true;
        else
            return false;
    }
}