package test;

public class test {

	public static void main(String[] args) {
		rectangle rect1 = new rectangle();
		// rectangle rect1;
		// rect1 = new rectangle();
		
		rect1.height = 100;
		rect1.width = 50;
		
		System.out.println("rect h:" + rect1.height);
		System.out.println("rect w:" + rect1.width);
		
	}

}


class rectangle{
	int width = 0, height = 0;
}
