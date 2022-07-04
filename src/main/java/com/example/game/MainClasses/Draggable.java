package com.example.game.MainClasses;

import javafx.scene.Node;

public class Draggable {

    private static double mouseX;
    private static double mouseY;

    public static void Dragg(Node node)
    {
        node.setOnMousePressed(mouseEvent -> {
            mouseX = mouseEvent.getX();
            mouseY=mouseEvent.getY();
        });

        node.setOnMouseDragged(mouseEvent -> {
            node.setLayoutX(mouseEvent.getSceneX()-mouseX);
            node.setLayoutY(mouseEvent.getSceneY()-mouseY);

        });
    }
}
