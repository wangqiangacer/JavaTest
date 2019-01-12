package com.itcast.MyGame;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Plane extends  GameObject {
    int speed=20;
    boolean left,up,right,down;
    boolean Live=true;
    public  void drawSelf(Graphics g){
        if(Live){
            g.drawImage(img,(int)x,(int)y,null);
            if(left){
                x-=speed;
            }
            if(right) {
                x += speed;
            }
            if(up){
                y-=speed;
            }
            if(down){
                y+=speed;
            }
        }else {
            g.setFont(new Font("宋体",Font.BOLD,50));
            g.drawString("Game Over！！！",800,800);


        }

    }
    public Plane(Image img,double x,double y){
        this.img=img;
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.width=img.getWidth(null);
        this.height=img.getHeight(null);

    }
    //增加相应的方向
    public  void addDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_A:
                left=true;
                break;
            case KeyEvent.VK_W:
                up=true;
                break;
            case KeyEvent.VK_D:
                right=true;
                break;
            case KeyEvent.VK_S:
                down=true;
                break;

        }
    }
    //抬起取消相应的方向
    public  void minusDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case (KeyEvent.VK_A):
                left=false;
                break;
            case KeyEvent.VK_W:
                up=false;
                break;
            case KeyEvent.VK_D:
                right=false;
                break;
            case KeyEvent.VK_S:
                down=false;
                break;

        }
    }

    public Plane() {
    }
}
