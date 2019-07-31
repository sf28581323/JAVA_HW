package test;

public class test {

	public static void main(String[] args) {
		double pi = 3.141592;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		double input = s.nextDouble();
		
		double area = input * input * pi;
		
		System.out.print("圓面積: " + area);
		
		
	}

}
