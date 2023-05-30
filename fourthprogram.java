package javatraining;

	class Student
	{
		int id;
		int age;
		int mobno;
		String name;

		void getData(int r,String nm,int a,int mn)
		{
			id = r;
			name = nm;
			age = a;
			mobno=mn;
		}

		void display()
		{
			System.out.println("id = " + id);
			System.out.println("Name = " + name);
			System.out.println("age = " + age);
			System.out.println("age = " + mobno);
		}
	}

	public class fourthprogram
	{
		public static void main(String s[])
		{
			Student s1 = new Student();
			s1.getData(1, "Piyush", 19,9887);
			s1.display();
		}
	}
	

