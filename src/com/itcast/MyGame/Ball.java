package com.itcast.MyGame;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Ball extends GameObject {
    boolean up;


    public Ball(){
        width=15;
        height=15;
        speed=10;
    x=1030;
    y=500;

    }
boolean live=true;
    public  void draw(Graphics g){

            Color color = g.getColor();
            g.setColor(Color.red);
            g.fillOval((int)x,(int)y,width,height);
            if(up){
                y-=speed;
            }
            g.setColor(color);




    }


    public void addDirection(KeyEvent event){
        if(event.getKeyCode()==KeyEvent.VK_ENTER){
            up=true;
        }

    }

}
