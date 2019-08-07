package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
	
public class test {
	
	static Frame frm = new Frame("456456");
	static Button btn = new Button("Press me!");
	static Label lab = new Label("I am pig");
	
	static int status = 0;
	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setSize(300, 300);
		frm.setLocation(100, 100);
		frm.setBackground(new Color(196, 98, 178));
		
		btn.setLocation(100, 100);
		btn.setSize(100, 100);
		
		
		btn.addActionListener(new listener());
		
		frm.add(btn);
		
		frm.setVisible(true);
	}
	
	static class listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			status++;
			if(status == 1)
			frm.setBackground(Color.cyan);
			if(status == 2)
			frm.setBackground(Color.black);
		}
	}
}
	

