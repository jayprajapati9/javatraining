package finalkeyword;

class Circle {
	final double PI = 3.1415;

	public double getArea(double radius) {
		return PI * radius * radius;
	}

}

public class finalvariable {
	public static void main(String[] args) {

		Circle circle = new Circle();
		double area = circle.getArea(5.0);
		System.out.println("Area: " + area);

		// Attempt to change the value of PI (compile-time error)
		circle.PI = 3.14;
	}

}
