    
package test;


public class test {

	private static java.util.Scanner scanner;

	public static void main(String[] args) {
		scanner = new java.util.Scanner(System.in);
		int times = scanner.nextInt();
		for(int i = 0; i < times; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			if(d-c==c-b && c-b==b-a) {
				int e = d+(d-c);
				System.out.print(a+" ");
				System.out.print(b+" ");
				System.out.print(c+" ");
				System.out.print(d+" ");
				System.out.println(e);
			}
			else if(d/c==c/b && c/b==b/a) {
				int e = d*(d/c);
				System.out.print(a+" ");
				System.out.print(b+" ");
				System.out.print(c+" ");
				System.out.print(d+" ");
				System.out.println(e);
			}
		}
		
		
	}
}
