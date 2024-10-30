package studio7;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//instance variables
	private double length;
	private double width;

	//constructor
	public rectangle (double len, double wid) {
		this.length = len;
		this.width = wid;
		
		
	}
	
	public double area () {
		return length * width;
	}
	
	public double perimeter () {
		return length * 2 + width * 2;
	}
	
	public boolean isSquare () {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}
	
	public void drawRectangle () {
		
	}
	
}

