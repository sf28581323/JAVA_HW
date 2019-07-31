    
package test;

public class test {

	public static void main(String[] args) {
		
		
		int sum = 0;
		
		for(int i = 0 ; i <= 100 ; i++) {
			
			
			if(i >= 20 && i <= 50) continue;
			
			sum = sum + i;
			
			
		}

		System.out.print(sum);
	}

}
