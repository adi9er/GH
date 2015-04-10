package com.example.billsu.ghosthunter;

import android.graphics.Rect;

/**
 * Created by AlysonI on 4/10/2015.
 * my shit to do:
 * Create main ghost
 * create two ghost sub classes, follow and float
 * list of all the ghosts in main
 * use andriod, and just copy what happened with the scared person.
 *
 */
public class Ghost {

    private double x;
    private double y;
    private double tY; //targetY
    private double tX; //targetX
    private Rect hitbox;
    private double width; //of the image
    private double height; //of the image

    public Ghost( double startX, double startY, double h, double w){
        this.x = startX;
        this.y = startY;
        this.height = h;
        this.width = w;
        this.hitbox = new Rect((int)this.x, (int)this.y, (int)(this.x + this.width),
                (int)(this.y + this.height) );
        this.tX = startX;
        this.tY = startY;
    }
    //basic getters & setters---------------------------------------------------
    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setTY(double target) {
        this.tY = target;
    }

    public void setTX(double target){
        this.tX = target;
    }
     //move method if we want the ghost to follow the girl-----------
    public void stalk() {
        // calculate velocities
        double deltaX = this.tX - this.x;
        double deltaY = this.tY - this.y;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        double xSpeed = 0;
        double ySpeed = 0;
        if (distance > 0) {
            // xSpeed = this.speed * (deltaX / distance);
            // ySpeed = this.speed * (deltaY / distance);
        }
        // actually move now
        this.x = this.x + xSpeed; //* time;
        this.y = this.y + ySpeed; //* time;
    }}
