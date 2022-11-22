package com.example.demo;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class AnimationController extends AnimationTimer {
    private Camera myCamera;
    private Heros myHero;
    private Scene myScene;

    public AnimationController(Camera cam, Heros toto,Scene myScene){
        this.myCamera=cam;
        this.myHero=toto;
        this.myScene=myScene;
    }
    @Override
    public void handle(long currentNanoTime){
        myHero.getImageview().setX(myHero.getX()-myCamera.getX());
        myHero.getImageview().setY(myHero.getY()-myCamera.getY());

        int index=(int)((currentNanoTime/1000000)/250)%6;
        myHero.getImageview().setViewport(new Rectangle2D(10+(85*index),0,65,100));

    }
    public void setup(){
        this.myScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                KeyCode code=keyEvent.getCode();
                if(code==KeyCode.D){
                    myHero.setX(myHero.getX()+10);
                }
                if(code==KeyCode.Q){
                    myHero.setX(myHero.getX()-10);
                }
                if(code==KeyCode.Z){
                    myHero.setY(myHero.getY()-10);
                }
                if(code==KeyCode.S){
                    myHero.setY(myHero.getY()+10);
                }
            }
        });

    }

}
