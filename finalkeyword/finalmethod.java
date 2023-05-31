package finalkeyword;

class Shape {
	public final void calculateArea() {
		System.out.println("Calculating area of the shape...");
	}
}


class Rectangle extends Shape {
	// Uncomment the following method will result in a compile-time error
	// try to override final method  by child class
	public void calculateArea() {
		System.out.println("Calculating area of the rectangle...");
	}
}

public class finalmethod {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.calculateArea();

		Rectangle rectangle = new Rectangle();
		rectangle.calculateArea();
	}
}
