package com.itcast.MyGame;

import java.awt.*;

public class Explode {
    double x,y;

    public Explode(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static  Image[] images=new Image[16];
    static {
        for (int i = 0; i < images.length; i++) {
            images[i]=GameUtil.getImage("images/"+(i+1)+".gif");
            images[i].getWidth(null);
        }
    }
    int count;
    public void draw(Graphics graphics){
        if(count<=15){
            graphics.drawImage(images[count],(int)x,(int)y,null);
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }


    }



}
