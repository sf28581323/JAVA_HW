package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		rectangle rect1 = new rectangle();
		
		rect1.height = 100;
		rect1.width = 50;
		
		System.out.println("rect h:" + rect1.height);
		System.out.println("rect w:" + rect1.width);
		
		
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		int h = s.nextInt();
		
		rect1.change_w_h(w, h);
		
		
		System.out.println("rect w:" + rect1.get_area());
		System.out.println("rect w:" + rect1.get_perimeter());
		
	}

}
