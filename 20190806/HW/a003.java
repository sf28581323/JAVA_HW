package text;


public class text {

	private static java.util.Scanner scanner;

	public static void main(String[] args) {
		scanner = new java.util.Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int s;
		s = (a*2+b)%3;
		if(s==0) {
			System.out.println("普通");
		}
		else if(s==1) {
			System.out.println("吉");
		}
		else if(s==2) {
			System.out.println("大吉");
		}
		
		
		


	}
	


}
