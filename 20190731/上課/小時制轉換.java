    
package test;

public class test {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int input = 0;
		input = scanner.nextInt();
		
		if(input >= 12) {
			input = input -12;
		}
		System.out.print(input);
		
		
		if(input/12==0) {
			System.out.print("早上"+input%12+"點");
		} else {
			System.out.print("下午"+input%12+"點");
			
		
		}
	}

}
