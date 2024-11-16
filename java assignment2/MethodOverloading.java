// Question 6: Write a Java program to show method overloading.

class MethodOverloading {
    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("Sum of 10 and 20: " + obj.add(10, 20));
        System.out.println("Sum of 10, 20 and 30: " + obj.add(10, 20, 30));
        System.out.println("Sum of 10.5 and 20.5: " + obj.add(10.5, 20.5));
    }
}