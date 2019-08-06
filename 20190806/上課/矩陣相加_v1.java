package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int[][] a = {
				{1, 2}, 
				{3, 4}
				};
		int[][] b = {
				{5, 6}, 
				{7, 8}
				};
		int[][] c = new int[2][2];
		
		c[0][0]=a[0][0]+b[0][0];
		c[0][1]=a[0][1]+b[0][1];
		c[1][0]=a[1][0]+b[1][0];
		c[1][1]=a[1][1]+b[1][1];
		
		System.out.println(c[0][0]+" "+c[0][1]);
		System.out.println(c[1][0]+" "+c[1][1]);
		

	}
}

