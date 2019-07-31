    
package test;

public class test {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int input = 0;
		input = scanner.nextInt();	
		System.out.print(input/60+"小時"+input%60+"分鐘");

	}

}
