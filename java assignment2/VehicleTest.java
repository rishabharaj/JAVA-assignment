// Question 10: Write a program to create a class named Vehicle having protected instance variables regnNumber, speed, color, ownerName
// and a method showData() to show "This is a vehicle class". Inherit the Vehicle class into subclasses named Bus and Car having individual
// private instance variables routeNumber in Bus and manufacturerName in Car and both of them having showData() method showing all details
// of Bus and Car respectively with content of the super class’s showData() method.

class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Bus bus = new Bus("MP09AB1234", 60, "Red", "Rishabh", 25);
        Car car = new Car("MP09XY5678", 120, "Blue", "Raj", "Toyota");

        System.out.println("Bus Details:");
        bus.showData();

        System.out.println("\nCar Details:");
        car.showData();
    }
}
