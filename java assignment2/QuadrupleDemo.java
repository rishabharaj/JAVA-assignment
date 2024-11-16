// Question 24: Write a Java program to create a generic class Quadruple that holds four objects of any type.
// Demonstrate the use of this generic class by creating quadruples of different types and printing their values.

class Quadruple<T, U, V, W> {
    private T first;
    private U second;
    private V third;
    private W fourth;

    public Quadruple(T first, U second, V third, W fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public V getThird() {
        return third;
    }

    public W getFourth() {
        return fourth;
    }

    @Override
    public String toString() {
        return "Quadruple{" + "first=" + first + ", second=" + second + ", third=" + third + ", fourth=" + fourth + '}';
    }
}

class QuadrupleDemo {
    public static void main(String[] args) {
        Quadruple<Integer, String, Double, Boolean> quadruple1 = new Quadruple<>(1, "One", 1.1, true);
        Quadruple<String, String, Integer, Character> quadruple2 = new Quadruple<>("Hello", "World", 100, 'A');
        Quadruple<Double, Boolean, Character, String> quadruple3 = new Quadruple<>(3.14, false, 'B', "Example");

        System.out.println(quadruple1);
        System.out.println(quadruple2);
        System.out.println(quadruple3);
    }
}
