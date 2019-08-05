package text;


public class text {

	private static java.util.Scanner scanner;

	public static void main(String[] args) {
		scanner = new java.util.Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = add(a,b);
		System.out.print(sum);

	}
	
	public static int add(int a,int b) {
		if(a<b) {
			return ((a+b)*(b-a+1))/2;
		} 
		else {
			return ((a+b)*(a-b+1))/2;
			
		}
	}

}
