package test;


public class test {

	public static void main(String[] args) {
		int[] score = {80, 60 ,95};
		
		System.out.println(score[1]);
		
		
		my(score);
		System.out.println(score[1]);
		
		
	}
	
	public static void my(int[] score) {
		score[1] = 100;
		System.out.println(score[1]);
		
	}
}
