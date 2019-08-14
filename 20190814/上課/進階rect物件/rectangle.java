package test;

class rectangle{
	
	public static void main(String[] args) {
		
	}
	
	int width = 0, height = 0;
	
	void change_w_h(int w, int h) {
		width = w;
		height = h;
	}
	
	public int get_perimeter() {
		return 2 * (width + height);
	}
	
	public int get_area() {
		return width * height;
	}
}
