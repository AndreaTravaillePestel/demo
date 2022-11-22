package com.example.demo;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Heros {
    private double x;
    private double y;

    private ImageView imageview;

    public Heros(double x, double y) {
        this.x = x;
        this.y = y;
        this.imageview = new ImageView(new Image("C:\\Users\\Surface Pro 3\\Documents\\img\\heros.png"));
        imageview.setViewport(new Rectangle2D(20,0,65,100));
        imageview.setX(200);
        imageview.setX(300);
    }

/*

    public void updateImageViewinscene(Camera man, long time){
        imageview.setX(x-man.getX());
        imageview.setY(y-man.getY());

        int index=(int)((time/1000000)/250)%6;
        imageview.setViewport(new Rectangle2D(10+(85*index),0,65,100));
        if (x==750){x=0;};
    }

 */
    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double newx){this.x=newx;}
    public void setY(double newy){this.y=newy;}

    public ImageView getImageview(){return imageview;}




}
