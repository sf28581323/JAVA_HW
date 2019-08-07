	package test;
	
	import java.util.Scanner;
	
	public class test {
	
		public static void main(String[] args) {
			System.out.print(fac(10));
		}
		
		public static int fac(int n) {
			if(n == 0)
				return 1;
			else
				return n * fac(n-1);
		}
		
		
	}
	
