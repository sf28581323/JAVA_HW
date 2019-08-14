package text;


public class text {

	private static java.util.Scanner scanner;

	public static void main(String[] args) {
		scanner = new java.util.Scanner(System.in);
		
		while(scanner.hasNext()) {
			int a = scanner.nextInt();
			if((a%4==0 && a%100!=0)||a%400==0) {
				System.out.println("閏年");
			}
			else {
				System.out.println("平年");
			}
		}
		
	}
}
