    
package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		boolean flag = true;
		
		while(flag) {
			if( a % 2 == 1) {
				flag = false;
			}else {
				a = a / 2;
			}
			
		}
		
		System.out.print(a);
			
	}

}
