package com.nbcb.design.templatemethod.myframe;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "Hello UI!";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame my = new MyFrame("Head First Frame ...");
    }
}
