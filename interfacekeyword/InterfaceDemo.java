package interfacekeyword;

/*
 
 interface is fully abstract class
 contains only abstract method (method without body,implementation that means only declaration)
 
 and like abstract class we can not create its instance.
 
 to use interface in other class we must implement it  using "implements" keyword 
 and the class which implements the interface must implement the inherited abstract method
 
 
* mainly use for two reason
 	- to Achieve Fully Abstraction
 	- to Achieve Multiple Inheritance
 		(Child class inherits the properties from more than one parent class)
 
 
 - interface extends interface1, interface2 
 - class extends class
 - class implements interface1, interface2
 
 

 * Why Java Does Not Support Multiple Inheritance ? 
 	- Consider a case where class Main extends class A and Class B and both class A and C 
 	  have the same method display().
 	  and when we create instance of main class and when we call display() method then 
 	  Ambiguity problem occurs
 	- makes compiler unclear and difficult to decide which one to take.
    - Now java compiler cannot decide, which display method it should inherit. 
      To prevent such situation, multiple inheritances is not allowed in java.	

*/

interface Language2 {
	/* All the methods in interface are by default(implicitly) public 
	  and all variable are by default(implicitly) public static final.  */
	
	// by default public static final
	String type = "programming language";

	// by default public
	void getName();
}

interface P{
	int a = 10;
	void display();
}
interface Q extends P{
	int b = 11;
	void display();
}
interface R extends P{
	int c =12;
	void display();
}
interface S extends Q,R{
	void display();
}

class X implements S{
	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
			P p;
			p = new X();
			p.display();
	}
}
