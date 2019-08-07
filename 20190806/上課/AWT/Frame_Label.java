package test;

import java.awt.*;
import java.util.Scanner;
	
public class test {
	public static void main(String[] args) {
		
		Frame frm = new Frame("123123");
		Label lab = new Label("I am label");
		
		frm.setSize(300, 300);
		frm.setBackground(new Color(200, 166, 200));
		frm.setForeground(new Color(80, 80, 80));
		frm.setLocation(100, 100);
		frm.add(lab);
		
		lab.setText("hahaha");
		lab.setSize(100, 100);
		lab.setLocation(60, 50);

		lab.setForeground(Color.blue);
		lab.setAlignment(Label.CENTER);
		
		Font fnt = new Font("Serief", Font.ITALIC + Font.BOLD, 18);
		lab.setFont(fnt);
		
		frm.setVisible(true);
	}
}
	

