package tasks;

class Product {
   private String name;
   private double price;
   private int quantity;
   private static int totalSold;

   public Product(String name, double price, int quantity) {
       this.name = name;
       this.price = price;
       this.quantity = quantity;
   }

   public void sell(int quantity) {
       this.quantity -= quantity;
       totalSold += quantity;
   }

   public static int getTotalSold() {
       return totalSold;
   }
}
public class ProductsTask{
	    public static void main(String[] args) {
	        // Create new instances of Product and set their name, price, and quantity
	        Product product1 = new Product("Product 1", 10.99, 50);
	        Product product2 = new Product("Product 2", 5.99, 100);
	        Product product3 = new Product("Product 3", 15.99, 25);

	        // Call the sell() method for some of the product instances to simulate selling them
	        product1.sell(10);
	        product2.sell(25);

	        // Print the total quantity of products sold using the getTotalSold() method
	        int totalSold = Product.getTotalSold();
	        System.out.println("Total quantity of products sold is: " + totalSold);
	    }
	}