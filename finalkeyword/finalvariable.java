package finalkeyword;

class Circle {
	final double PI = 3.1415;
}

public class finalvariable {
	public static void main(String[] args) {

		Circle circle = new Circle();

		// Attempt to change the value of PI (compile-time error)
		circle.PI = 3.14;
	}

}
