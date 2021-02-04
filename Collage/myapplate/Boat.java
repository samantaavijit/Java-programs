package com.avijitsamanta.Collage.myapplate;

import java.applet.Applet;
import java.awt.*;

public class Boat extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawString("Triangle", 300, 50);
        g.drawLine(100, 350, 550, 350);
//        g.drawArc(100, 275, 450, 150, 180, 180);
//        g.fillArc(100,275,450,150,180,180);
//        g.drawLine(300,100,300,350);
//        g.drawLine(300,100,400,240);
//        g.drawLine(300,350,400,240);

        g.drawLine(300,100,100,350);
        g.drawLine(300,100,550,350);
    }
}
