package com.example.demo;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Fond {
    private double x;
    private double y;

    private ImageView imageview;

    public Fond(double x, double y) {
        this.x = x;
        this.y = y;
        this.imageview = new ImageView(new Image("C:\\Users\\Surface Pro 3\\Documents\\img\\desert.png"));
        imageview.setViewport(new Rectangle2D(20,0,1600,400));
        //imageview.setX(800);
        imageview.setX(0);
    }

    public ImageView getImageview() {
        return imageview;
    }

    public void updateImageViewinscene(Camera man){
        imageview.setX(x-man.getX());
        imageview.setY(y-man.getY());
    }
}
