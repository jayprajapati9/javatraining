package javatraining;

class Student {
	int id;
	int age;
	int mobno;
	String name;

	void getData(int r, String nm, int a, int mn) {
		id = r;
		name = nm;
		age = a;
		mobno = mn;
	}

	void display() {
		System.out.println("id = " + id);
		System.out.println("Name = " + name);
		System.out.println("age = " + age);
		System.out.println("mobile no = " + mobno);
	}
}

public class fourthprogram {
	public static void main(String s[]) {
		Student s1 = new Student();
		s1.getData(1, "Jay", 20, 1122334455);
		s1.display();
	}
}
