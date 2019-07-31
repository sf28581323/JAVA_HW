package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int pass = 60;
		int input = 0;
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		
		if(input>=60) {
			System.out.print("pass");
		}else {
			System.out.print("fail");
		}
	}

}
