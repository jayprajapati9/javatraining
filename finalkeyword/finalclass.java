package finalkeyword;

// create a final class
class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }
}

// try to extend the final class
public class finalclass extends MathUtils {
	
	public int add(int a, int b) {
        return a - b;
    }
	
	public static void main(String[] args) {
		finalclass obj = new finalclass();
		System.out.println("Addition Of Two Number is: "+ obj.add(6,2));
	}
}


