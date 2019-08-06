package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[][] num = new int[2][4];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				num[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		

	}
}

