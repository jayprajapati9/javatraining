package abstractkeyword;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Meow");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {

        Cat cat = new Cat("Leo", 5);
    	Dog dog = new Dog("Max", 3);

        cat.makeSound(); // Output: Meow
        dog.makeSound(); // Output: Woof
    }
}

