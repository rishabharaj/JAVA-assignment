class Box {
    double width;
    double height;
    double depth;
    // Constructor 1: No parameters (default constructor)
    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }
    // Constructor 2: All parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Constructor 3: Cube (one parameter, where all sides are equal)
    Box(double side) {
        width = height = depth = side;
    }
    // Method to calculate and return the volume of the box
    double volume() {
        return width * height * depth;
    }
}
public class Volume {
    public static void main(String[] args) {
        // Creating box objects using different constructors

        // Box with default constructor
        Box box1 = new Box();
        System.out.println("Volume of box1 (default): " + box1.volume());

        // Box with all dimensions
        Box box2 = new Box(10, 20, 30);
        System.out.println("Volume of box2: " + box2.volume());

        // Cube box (all sides equal)
        Box box3 = new Box(5);
        System.out.println("Volume of box3 (cube): " + box3.volume());
    }
}