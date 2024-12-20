package com.hotelreservation.hotelreservation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;

    private double x;
    private double y;

    public void up(ActionEvent e) {
//        System.out.println("up");
        myCircle.setCenterY(y-=10);
    }

    public void right(ActionEvent e) {
        myCircle.setCenterX(x+=10);
//        System.out.println("right");
    }

    public void down(ActionEvent e) {
        myCircle.setCenterY(y+=10);
//        System.out.println("down");
    }

    public void left(ActionEvent e) {
        myCircle.setCenterX(x-=10);
//        System.out.println("left");
    }

}
