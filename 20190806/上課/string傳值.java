package test;


public class test {

	public static void main(String[] args) {
		String x = "111";
		
		System.out.print(x);
		
		
		my(x);
		System.out.print(x);
		
		
	}
	
	public static void my(String x) {
		x = "222";
		System.out.print(x);
		
	}
}
