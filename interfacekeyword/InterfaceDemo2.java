package interfacekeyword;



interface interface_name{      
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  


interface Language {
	String type = "programming language";
	void getName();
}

interface Java extends Language {
	String javaType = "Java";
	void getName();
}

interface Python extends Language {
	String pythonType = "Python";
	void getName();
}

interface Javascript extends Java, Python {
	String jsType = "Javascript";
	void getName();
}

public class InterfaceDemo2 implements Javascript {

	public void getName() {
		System.out.println("Language Type: " + Language.type);
		System.out.println("Java Type: " + Java.javaType);
		System.out.println("Python Type: " + Python.pythonType);
		System.out.println("Javascript Type: " + Javascript.jsType);
	}

	public static void main(String[] args) {
		InterfaceDemo2 obj = new InterfaceDemo2();
		obj.getName();
	}
}
