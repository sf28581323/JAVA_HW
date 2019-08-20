package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;


public class test implements KeyListener {
    Frame frame;
    Label a1, a2;
     
    public static void main(String[] args) {
        new test();
    }
     
    public test() {
        frame = new Frame("AWTDemo");
        frame.addWindowListener(new AdapterDemo());
        frame.addKeyListener(this);
        frame.setSize(640, 480);
        frame.setLayout(null);
 
        a1 = new Label("demo1");
        a1.setSize(200, 30);
        a1.setLocation(100, 30);
        frame.add(a1);
        a2 = new Label("demo2");
        a2.setSize(200, 30);
        a2.setLocation(100, 70);
        frame.add(a2);
         
        frame.setVisible(true);
    }
     
    public void keyTyped(KeyEvent e) {
        a1.setText("which : " + e.getKeyChar());
    }
    public void keyPressed(KeyEvent e) {
        a2.setText("Key pressed!");
    }
    public void keyReleased(KeyEvent e) {
        a2.setText("Key released!");
    }
}
 
class AdapterDemo extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
