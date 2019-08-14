package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new java.util.Scanner(System.in); 
		circle a = new circle();
		
		a.radius = scanner.nextInt();
		System.out.println("使用者輸入的半徑: "+a.radius);
		
		a.area = a.get_area();
		System.out.println("圓的面積: "+ a.area);
		
	}

}


class circle{
	double radius = 0;
	double area = 0;
	
	double get_area() {
		return radius * radius * 3.14;
	}
	
}
