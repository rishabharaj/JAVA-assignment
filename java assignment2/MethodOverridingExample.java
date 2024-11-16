// Question 7: Write a Java program to show method overriding.

class ParentClass {
    void display() {
        System.out.println("This is the display method of ParentClass");
    }
}

class ChildClass extends ParentClass {
    @Override
    void display() {
        System.out.println("This is the display method of ChildClass");
    }
}

class MethodOverridingExample {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        parent.display();

        ChildClass child = new ChildClass();
        child.display();

        ParentClass parentReference = new ChildClass();
        parentReference.display();
    }
}