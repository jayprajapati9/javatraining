package javatraining;

class Employee {
	String Name;
	int Year;
	String Address;

	Employee(String nam, int years, String addr) {
		Name = nam;
		Year = years;
		Address = addr;
	}

	void Jay() {

		System.out.println(Name + "        " + Year + "         " + Address);
	}

	void Johnny() {

		System.out.println(Name + "     " + Year + "            " + Address);
	}

	void Steve() {
		System.out.println(Name + "    " + Year + "       " + Address);
	}
}

public class sixthprogram {
	public static void main(String args[]) {
		System.out.println("Name" + "  Year of Joining     " + "Address");
		Employee e = new Employee("Jay", 2000, "68D-WallsStreet");
		e.Jay();
		Employee e1 = new Employee("Johnny", 1994, "64C-WallsStreet");
		e1.Johnny();
		Employee e2 = new Employee("Steve", 2002, "70F-WallsStreet");
		e2.Steve();
	}
}
