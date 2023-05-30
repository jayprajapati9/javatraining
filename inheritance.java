package javatraining;

// Parent class
class Student1 {
    protected String name;

    public Student1(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Name: " + name);
    }
}

// Child class inheriting from Student1
class Jay extends Student1 {
    public Jay(String name) {
        super(name);
    }

    public void showName() {
        System.out.println("Name: " + name);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Jay jay = new Jay("Jay Prajapati");
        jay.showName();
    }
}
