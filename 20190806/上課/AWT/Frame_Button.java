package test;

import java.awt.*;
import java.util.Scanner;
	
public class test {
	public static void main(String[] args) {
		
		Frame frm = new Frame("456456");
		Label lab = new Label("I am pig");
		
		frm.setLayout(null);
		frm.setSize(300, 300);
		frm.setLocation(100, 100);
		frm.setBackground(new Color(196, 98, 178));
		
		Button btn = new Button("Press me!");
		btn.setLocation(100, 100);
		btn.setSize(100, 100);
		frm.add(btn);
		
		frm.setVisible(true);
	}
}
	

