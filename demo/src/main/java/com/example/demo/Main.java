package com.example.demo;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
        Heros toto;
        Fond desert;
        Fond desertdroit;
        Camera cam;
/*
        AnimationTimer unAutreJour=new AnimationTimer() {
                @Override
                public void handle(long l) {
                        toto.updateImageViewinscene(cam, l);
                }
        };
        */

        @Override
public void start(Stage primaryStage) throws Exception{
                Music myMusic=new Music("Yoshi_Valley.mp4");
                myMusic.start();
        toto=new Heros(1050,300);
        cam=new Camera(700,0);

        desert=new Fond(3000,3000);
        desertdroit=new Fond(3000,3000);



        primaryStage.setTitle("Hello world");
        Group root = new Group();
        Pane pane = new Pane(root);
        Scene theScene = new Scene(pane, 800, 400,true);
        primaryStage.setScene(theScene);
        primaryStage.show();
        AnimationController animationController=new AnimationController(cam, toto,theScene);
        animationController.setup();
        animationController.start();

        ImageView spriteSheet3 =desertdroit.getImageview();
        ImageView spriteSheet2 =desert.getImageview();
        ImageView spriteSheet =toto.getImageview();

        pane.getChildren().addAll(spriteSheet3);
        pane.getChildren().addAll(spriteSheet2);
        pane.getChildren().addAll(spriteSheet);

        }
        public static void main(String[] args) {
        launch(args);
        }

}