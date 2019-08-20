    
package test;


public class test {

	private static java.util.Scanner scanner;

	public static void main(String[] args) {
		scanner = new java.util.Scanner(System.in);
		while(scanner.hasNext()) {
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			
			int temp = b*b-4*a*c;
			if(temp>0) {
				System.out.println("Two different roots x1="+(-b+temp)/(2*a)+" , "+"x2="+(-b-temp)/(2*a));
			}
			else if(temp==0) {
				System.out.println("Two same roots x="+-b/(2*a));
			}
			else if(temp<0) {
				System.out.println("No real root");
			}
		}
		
	}
}
