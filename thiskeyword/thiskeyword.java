package thiskeyword;

class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Course: " + this.course);
        System.out.println("\n\n");
    }

    public void enrollCourse(String course) {
        System.out.println(this.name + " is enrolling in the course: " + course);
        this.course = course +", "+ this.course ;
    }
}

public class thiskeyword {
    public static void main(String[] args) {
        Student student1 = new Student("Jay", 20, "Information Technology");
        student1.displayDetails();

        Student student2 = new Student("Bob", 19, "Computer");
        student2.displayDetails();

        student1.enrollCourse("Data Science");
        student1.displayDetails();
    }
}
