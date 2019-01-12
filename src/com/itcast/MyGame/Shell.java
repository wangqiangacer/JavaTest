package com.itcast.MyGame;

import java.awt.*;

public class Shell extends  GameObject {
    double degree;
    public Shell(){
        x=200;
        y=200;
        width=20;
        height=20;
        speed=5;
        //随机角度在0到360
        degree=Math.random()*Math.PI*2;
    }
    boolean live=true;
    public  void draw(Graphics g){
        if(live){
            Color color = g.getColor();
            g.setColor(Color.yellow);
            g.fillOval((int)x,(int)y,width,height);

            //炮弹眼任意角度去飞
            x+=speed*Math.cos(degree);
            y+=speed*Math.sin(degree);
            if(x<0||x>Contanst.GAMN_WIDTH){
                degree=Math.PI-degree;
            }
            if(y<0||y>Contanst.GAMN_HEIGHT-20){
                degree=-degree;
            }
            g.setColor(color);

        }

    }

}
