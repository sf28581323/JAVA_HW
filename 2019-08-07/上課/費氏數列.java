	package test;
	
	import java.util.Scanner;
	
	public class test {
	
		public static void main(String[] args) {
			for(int i = 1; i <= 20; i++)
				System.out.print(fac(i) + " ");
		}
		
		public static int fac(int n) {
			if (n == 0)
				return 0;
			if(n == 1 || n == 2)
				return 1;
			else
				return fac(n-1) + fac(n-2);
		}
		
		
	}
	
