// Question 4: Write a Java program to show constructor overloading.

class ConstructorOverloading {
    int number;
    String name;

    // 0-arguments constructor
    public ConstructorOverloading() {
        this.number = 0;
        this.name = "Default";
        System.out.println("Number: " + number + ", Name: " + name);
    }

    // Parameterized constructor
    public ConstructorOverloading(int num, String nm) {
        this.number = num;
        this.name = nm;
        System.out.println("Number: " + number + ", Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(20, "Rishabh Raj");
    }
}
