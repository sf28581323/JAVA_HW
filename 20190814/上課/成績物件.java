package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		student h = new student();
		student p = new student();
		Scanner s = new Scanner(System.in);
		h.c = s.nextInt();
		h.e = s.nextInt();
		h.m = s.nextInt();
		p.c = s.nextInt();
		p.e = s.nextInt();
		p.m = s.nextInt();
		h.show_sum();
		p.show_sum();
	}
	
	


}


class student{
	int c = 0;
	int e = 0;
	int m = 0;
	
	public void show_sum(){
		System.out.println(c+e+m);
	}
}

