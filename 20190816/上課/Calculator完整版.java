package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;
	
public class test {
	
	static Frame frm = new Frame("Calculator");
	static Button btn0 = new Button(" 0 ");
	static Button btn1 = new Button(" 1 ");
	static Button btn2 = new Button(" 2 ");
	static Button btn3 = new Button(" 3 ");
	static Button btn4 = new Button(" 4 ");
	static Button btn5 = new Button(" 5 ");
	static Button btn6 = new Button(" 6 ");
	static Button btn7 = new Button(" 7 ");
	static Button btn8 = new Button(" 8 ");
	static Button btn9 = new Button(" 9 ");
	static Button btnp = new Button(" + ");
	static Button btnm = new Button(" - ");
	static Button btnx = new Button(" * ");
	static Button btnd = new Button(" / ");
	static Button btnl = new Button(" = ");
	
	static Font lab_font = new Font("Serief", Font.BOLD, 25);
	static Label lab_null = new Label("");
	static Label lab = new Label("0");
	
	static int a = 0;
	static int b = 0;
	static char op;
	static StringBuilder str = new StringBuilder("");
	static boolean bool_op = false;
	

	
	public static void main(String[] args) {
		lab.setFont(lab_font);
		
		frm.setLayout(new GridLayout(4, 4));
		frm.setSize(400, 300);
		frm.setLocation(100, 100);
		frm.setBackground(new Color(196, 98, 178));
		
		btn0.addActionListener(new listener());
		btn1.addActionListener(new listener());
		btn2.addActionListener(new listener());
		btn3.addActionListener(new listener());
		btn4.addActionListener(new listener());
		btn5.addActionListener(new listener());
		btn6.addActionListener(new listener());
		btn7.addActionListener(new listener());
		btn8.addActionListener(new listener());
		btn9.addActionListener(new listener());
		btnp.addActionListener(new listener());
		btnm.addActionListener(new listener());
		btnx.addActionListener(new listener());
		btnd.addActionListener(new listener());
		btnl.addActionListener(new listener());
		
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.add(btnp);
		frm.add(btn4);
		frm.add(btn5);
		frm.add(btn6);
		frm.add(btnm);
		frm.add(btn7);
		frm.add(btn8);
		frm.add(btn9);
		frm.add(btnx);
		frm.add(lab);
		frm.add(btn0);
		frm.add(btnl);
		frm.add(btnd);
		
		frm.addWindowListener(new w_listener());
		frm.setVisible(true);
	}
	
	static class listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnl) {
				System.out.println(a);
				System.out.println(b);
				int result = 0;
				switch(op) {
				case '+':
					result = a + b;
					break;
				case '-':
					result = a - b;
					break;
				case '*':
					result = a * b;
					break;
				case '/':
					result = a / b;
					break;
				}
				
				lab.setText(Integer.toString(result));
			}else if(bool_op == false) {
				if(e.getSource() == btn1) {
					a = a * 10 + 1;
					str.append("1");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn2) {
					a = a * 10 + 2;
					str.append("2");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn3) {
					a = a * 10 + 3;
					str.append("3");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn4) {
					a = a * 10 + 4;
					str.append("4");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn5) {
					a = a * 10 + 5;
					str.append("5");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn6) {
					a = a * 10 + 6;
					str.append("6");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn7) {
					a = a * 10 + 7;
					str.append("7");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn8) {
					a = a * 10 + 8;
					str.append("8");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn9) {
					a = a * 10 + 9;
					str.append("9");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn0) {
					a = a * 10;
					str.append("0");
					lab.setText(str.toString());
				}
				if(e.getSource() == btnp || e.getSource() == btnm || e.getSource() == btnx || e.getSource() == btnd) {
					bool_op = true;
					str = new StringBuilder("");
					if(e.getSource() == btnp) {
						op = '+';
						lab.setText("+");
					}
					if(e.getSource() == btnm) {
						op = '-';
						lab.setText("-");
					}
					if(e.getSource() == btnx) {
						op = '*';
						lab.setText("*");
					}
					if(e.getSource() == btnd) {
						op = '/';
						lab.setText("*");
						
					}
				}
				
			}else if(bool_op == true) {
				if(e.getSource() == btn1) {
					b = b * 10 + 1;
					str.append("1");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn2) {
					b = b * 10 + 2;
					str.append("2");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn3) {
					b = b * 10 + 3;
					str.append("3");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn4) {
					b = b * 10 + 4;
					str.append("4");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn5) {
					b = b * 10 + 5;
					str.append("5");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn6) {
					b = b * 10 + 6;
					str.append("6");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn7) {
					b = b * 10 + 7;
					str.append("7");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn8) {
					b = b * 10 + 8;
					str.append("8");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn9) {
					b = b * 10 + 9;
					str.append("9");
					lab.setText(str.toString());
				}
				if(e.getSource() == btn0) {
					b = b * 10;
					str.append("0");
					lab.setText(str.toString());
				}
			}
			
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
