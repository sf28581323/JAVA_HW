package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	char op = scanner.next().charAt(0);
	int b = scanner.nextInt();
	System.out.print(c(a,b,op));
	
	}
	
	
	public static int c(int a,int b,char op) {
		switch(op) {
		case '+': 
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default :
			return 0;
		}
	}
	
}
