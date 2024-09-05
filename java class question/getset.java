// Person class with private fields and getter/setter methods
class Person {
    // Private fields
    private String name;
    private int age;
    // Getter for the name field
    public String getName() {
        return name;
    }
    // Setter for the name field
    public void setName(String name) {
        this.name = name;
    }
    // Getter for the age field
    public int getAge() {
        return age;
    }
    // Setter for the age field
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}
// Main class to demonstrate getter and setter methods
public class getset {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();

        // Set values using setter methods
        person.setName("Rishabh");
        person.setAge(20);

        // Get values using getter methods
        System.out.println("Name: " + person.getName()); 
        System.out.println("Age: " + person.getAge());   
        // Attempt to set an invalid age
        person.setAge(-5);

        // Display the age after attempting to set an invalid value
        System.out.println("Age after invalid update: " + person.getAge());
    }
}