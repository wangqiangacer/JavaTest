package com.itcast.MyGame;

import javax.imageio.ImageIO;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    private  GameUtil(){}
    public static Image getImage(String path){
        BufferedImage bufferedImage=null;
        URL resource = GameUtil.class.getClassLoader().getResource(path);

        try {
             bufferedImage = ImageIO.read(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedImage;
    }
}
