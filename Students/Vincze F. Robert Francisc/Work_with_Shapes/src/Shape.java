
public class Shape {

	String color;
	boolean filled;

	public Shape() {
		color = "Green";
		filled = true;
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		filled = true;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return (filled == true);
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {

		if (this.filled == true) {
			return "A Shape with color of " + this.color + " and filled";
		}

		return "A Shape with color of " + this.color + " and not filled";

	}
}