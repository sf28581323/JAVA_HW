    
package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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
		frm.addWindowListener(new w_listener());
		
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
	static class w_listener implements WindowListener{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
	     }

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
	
}
