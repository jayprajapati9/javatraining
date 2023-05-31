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


/*
 * 
 * package javatraining;
 * 
 * 
 * public class statickeyword { // static variable static int staticValue = 10;
 * 
 * // static method static void staticMethod() {
 * System.out.println("Hello from staticMethod()");
 * System.out.println("Static variable value: " + staticValue); }
 * 
 * // non-static variable int nonStaticValue = 20;
 * 
 * // non-static method void nonStaticMethod() {
 * System.out.println("Hello from nonStaticMethod()");
 * System.out.println("Non-static variable value: " + nonStaticValue); }
 * 
 * public static void main(String[] args) { // Accessing static variable without
 * creating an object
 * System.out.println("Static variable accessed without object: " +
 * statickeyword.staticValue);
 * 
 * // Accessing static method without creating an object
 * statickeyword.staticMethod();
 * 
 * // Creating an object of the class statickeyword obj = new statickeyword();
 * 
 * // Accessing non-static variable using object
 * System.out.println("Non-static variable accessed using object: " +
 * obj.nonStaticValue);
 * 
 * // Accessing non-static method using object obj.nonStaticMethod(); } }
 * 
 */