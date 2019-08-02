    
package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum = 0;
		int b;
		
		/*while(a / 10 > 0) {
			b = a % 10;
			a = a / 10;
			sum = sum + b;
		}
		sum = sum + a;*/
		
		while(a != 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
		
		System.out.print(sum);
	}

}
