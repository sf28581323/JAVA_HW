package test;
	
import java.util.Scanner;
	
public class test {
	public static void main(String[] args) {
		int[] array = {-5, -77, -60, -52, -100, -79, -80, -91};
		
		
		int max = array[0];
		for(int i =0; i < array.length; i++) {
			if(array[i]>=max) {
				max=array[i];
			}
		}
		
		System.out.print("最大值:" + max);
		
	}
}
	
