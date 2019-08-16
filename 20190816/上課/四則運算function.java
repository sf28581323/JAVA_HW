package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	char op = scanner.next().charAt(0);
	int b = scanner.nextInt();
	c(a,b,op);
	
	}
	
	
	public static void c(int a,int b,char op) {
		if(op=='+') {
			System.out.print(a+b);
		}
		else if(op=='-') {
			System.out.print(a-b);
		}
		else if(op=='*') {
			System.out.print(a*b);
		}
		else if(op=='/') {
			System.out.print(a/b);
			
		}
	}
	
}
