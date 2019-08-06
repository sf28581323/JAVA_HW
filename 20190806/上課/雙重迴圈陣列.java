package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int[][] a = {
				{1, 2, 3}, 
				{4, 5, 6}
				};
		
		System.out.println(a[0][0]);

		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(a[j][i]);
			}
		}
		System.out.println(a[0][0]);
		System.out.println(a[1][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][2]);
		
		
		
			
	}
}

