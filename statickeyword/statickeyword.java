package statickeyword;

class Bookstore {
	private static int totalBooks = 0; // static variable

	public static void addBook() {
		totalBooks++; // static method
	}

	public static int getTotalBooks() {
		return totalBooks; // static method
	}
}

public class statickeyword {
	public static void main(String[] args) {
		// Every time increments when we call addbook()
		Bookstore.addBook();
		Bookstore.addBook();
		Bookstore.addBook();

		int totalBooksInStore = Bookstore.getTotalBooks();
		System.out.println("Total books in the bookstore: " + totalBooksInStore);
	}
}