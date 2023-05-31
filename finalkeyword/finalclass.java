package finalkeyword;

// create a final class
final class MyFinalClass {
	public void show() {
		System.out.println("This is a final method.");
	}
}

// try to extend the final class
public class finalclass extends MyFinalClass {
	public void show() {
		System.out.println("The final method is overridden.");
	}

	public static void main(String[] args) {
		finalclass obj = new finalclass();
		obj.show();
	}
}
