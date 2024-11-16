// Question 3: Write a Java program to show parameterized constructor.
import java.util.*;
class ParameterizedConstructor {
    int number;
    String name;

    public ParameterizedConstructor(int num, String nm) {
        this.number = num;
        this.name = nm;
        System.out.println("Number: " + number + ", Name: " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10, "Rishabh");
    }
}