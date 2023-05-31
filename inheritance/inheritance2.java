package inheritance;


class Member {
	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private double salary;

	public Member(String name, int age, String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}

	public void printSalary() {
		System.out.println("Salary " + salary);
	}
}

class Employee extends Member {
	private String specialization;

	public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}
}

class Manager extends Employee {
	private String department;

	public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
		super(name, age, phoneNumber, address, salary, department);
		this.department = department;
	}
}

public class inheritance2 {
	public static void main(String[] args) {
		Employee employee = new Employee("Jay", 20, "1122334455", "XYZ City", 24000, "IT");
		Manager manager = new Manager("John", 20, "999888777", "ABC Street", 10000, "Computer");
		employee.printSalary();
		manager.printSalary();
	}
}
