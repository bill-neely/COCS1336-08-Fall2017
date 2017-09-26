
public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int area() {
		return this.length * this.width;
	}

	public int perimeter() {
		return 2 * (this.length + this.width);
	}

	public float diagonal() {
		return (float) Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
		//return (float) Math.hypot(this.length, this.width);
	}

	public boolean isSquare() {
		return this.length == this.width;
	}

}
