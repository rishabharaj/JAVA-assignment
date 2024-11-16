// Question 8: Write a Java program to show method hiding.

class BaseClass {
    static void show() {
        System.out.println("This is the static show method of BaseClass");
    }
}

class DerivedClass extends BaseClass {
    static void show() {
        System.out.println("This is the static show method of DerivedClass");
    }
}

class MethodHidingExample {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        base.show();

        DerivedClass derived = new DerivedClass();
        derived.show();

        BaseClass baseReference = new DerivedClass();
        baseReference.show(); // Calls BaseClass's static method due to method hiding
    }
}