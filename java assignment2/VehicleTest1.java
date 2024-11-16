// Question 14: Write a Java program to create an interface named Vehicle, which contains methods for start() and stop().
// Implement this interface in two classes: Car and Bike. Demonstrate the working of these classes.

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}

class VehicleTest1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Car Actions:");
        car.start();
        car.stop();

        System.out.println("\nBike Actions:");
        bike.start();
        bike.stop();
    }
}
