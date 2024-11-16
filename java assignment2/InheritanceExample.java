// Question 5: Write a Java program to implement the concept of inheritance.

class Animal {
    void sound() {
        System.out.println("This is a generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

class InheritanceExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();

        Dog myDog = new Dog();
        myDog.sound();
    }
}