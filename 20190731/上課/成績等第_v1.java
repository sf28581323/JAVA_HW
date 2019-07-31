    
package test;

public class test {

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int input;
		input = s.nextInt();
		if(90 <= input && input <= 100 ) {
			System.out.print("A");
		}
		else if(80 <= input && input <= 89 ) {
			System.out.print("B");
		}
		else if(70 <= input && input <= 79 ) {
			System.out.print("C");
		}
		else if(60 <= input && input <= 69 ) {
			System.out.print("D");
		} else{
			System.out.print("E");
		}
	}

}
