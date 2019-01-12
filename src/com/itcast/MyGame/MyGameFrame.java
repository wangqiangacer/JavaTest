package com.itcast.MyGame;


import javax.swing.*;
import java.applet.AudioClip;


import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Date;

public class MyGameFrame  extends JFrame {
    public static void main(String[] args) {

        MyGameFrame gameFrame = new MyGameFrame();
        gameFrame.launchFrame();
    }


    Image planeImg = GameUtil.getImage("images/plane.png");
    Image bg = GameUtil.getImage("images/bgone.png");
   Plane plane=new Plane(planeImg,1000,500);
   Ball ball=new Ball();


   Shell shell=new Shell();
   Shell[] shells=new Shell[50];
   Explode explode;
     Date startTime=new Date();
    Date endTime;
    int alive;
    @Override
    public void paint(Graphics g) {
        Color color = g.getColor();
        Font f = g.getFont();
        g.setColor(Color.red);
        g.setFont(new Font("宋体",Font.BOLD,50));
     // g.drawString("雷霆战机",800,100);
        g.drawImage(bg,0,0,null);
        plane.drawSelf(g);
        //ball.draw(g);

        for(int i=0;i<shells.length;i++){
            shells[i].draw(g);
            boolean pengshellAndPlane=shells[i].getRect().intersects(plane.getRect());
            boolean pengshellAndBall=shells[i].getRect().intersects(ball.getRect());
            if(pengshellAndBall){
                shell.live=false;
            }
            if(pengshellAndPlane){
                plane.Live=false;

                if(explode==null){
                    endTime=new Date();
                    alive=(int)((endTime.getTime()-startTime.getTime())/1000);
                    explode=new Explode(plane.x,plane.y);
                }
                explode.draw(g);
            }
            if(!plane.Live){
                g.setColor(Color.red);
                g.drawString("你活了"+alive+"秒",(int)plane.x,(int)plane.y);
            }

        }


        g.setColor(color);
        g.setFont(f);
    }
    class  PaintThead extends  Thread{
        @Override
        public void run() {
            while (true){

               repaint();//重画

                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


//初始化窗口
    public  void launchFrame(){
        this.setTitle("雷霆战机终极版");
        this.setVisible(true);
        this.setSize(Contanst.GAMN_WIDTH,Contanst.GAMN_HEIGHT);
        this.setLocation(0,0);
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        new PaintThead().start();
        //增加键盘监听
        addKeyListener(new KeyMoiter());


        for(int i=0;i<shells.length;i++){
            shells[i]=new Shell();
        }
    }
    //键盘监听
    class KeyMoiter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
           plane.addDirection(e);//按下
            ball.addDirection(e);


        }

        @Override
        public void keyReleased(KeyEvent e) {
           plane.minusDirection(e);//抬起
            ball.addDirection(e);
        }
    }
  }




