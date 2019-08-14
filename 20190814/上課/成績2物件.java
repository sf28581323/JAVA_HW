package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		student h = new student();
		student p = new student();
		
		h.show_sum();
		p.show_sum();
	}
	
}


class student{
	Scanner s = new Scanner(System.in);
	int c = s.nextInt();
	int e = s.nextInt();
	int m = s.nextInt();
	
	public void show_sum(){
		System.out.println(c+e+m);
	}
}

