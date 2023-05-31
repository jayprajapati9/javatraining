package gettersetter;


class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // toString() method
    @Override
    public String toString() {
        return "Name: "+getName()+"  Age: "+getAge();
    }
}


public class gettersetter {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jay");
        person.setAge(20);

        System.out.println(person.getName()); // Output: Jay
        System.out.println(person.getAge()); // Output: 20
        System.out.println(person); 
    }
}

