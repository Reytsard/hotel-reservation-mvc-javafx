package com.hotelreservation.hotelreservation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("stylecss.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("LandingScene.fxml"));

//        Group root = new Group();
        Scene scene = new Scene(root);

        //if one scene use this.
//        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        //if more than one use this
        /*
        String css = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);
        scene2.getStylesheets().add(css);
         */


        stage.setTitle("JAVAFX");
        stage.setScene(scene);
        stage.show();
    }
}
