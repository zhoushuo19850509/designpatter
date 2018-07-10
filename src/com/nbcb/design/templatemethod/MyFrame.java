package com.nbcb.design.templatemethod;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        this.setVisible(true);

    }

    /**
     * 重载方法 在子类中重新定义
     *
     */
    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "paint again";
        graphics.drawString(msg,100,100);

    }

    public static void main(String[] args){
        MyFrame myFrame = new MyFrame("hello");
    }
}
