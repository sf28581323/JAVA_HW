    
package test;

public class test {

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int input;
		input = s.nextInt();
		
		switch(input / 10) {
			case 10:  case 9:  
				System.out.print("A"); 
				break;
				
			case 8 : 
				System.out.print("B"); 
				break;
				
			case 7 : 
				System.out.print("C");
				break;
				
			case 6 : 
				System.out.print("D");
				break;	
				
			default : 
				System.out.print("Fail");
				
		
		}
	}

}
