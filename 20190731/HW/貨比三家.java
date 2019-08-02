    
package test;

public class test {

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
/*		if(a <= b && a <= c ) {
			System.out.print(a);
		}
		else if(b <= a && b <= c ) {
			System.out.print(b);
		}
		else{
			System.out.print(c);
		}*/
		
		if(a < b) {
			if(a < c) {
				//a
			}else {
				//c
			}
		}else {
			if(b < c) {
				//b
			}else {
				//c
			}
		}
	}

}
