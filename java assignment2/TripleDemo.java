// Question 23: Write a Java program to create a generic class Triple that holds three objects of any type.
// Demonstrate the use of this generic class by creating triples of different types and printing their values.

class Triple<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
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

    @Override
    public String toString() {
        return "Triple{" + "first=" + first + ", second=" + second + ", third=" + third + '}';
    }
}

class TripleDemo {
    public static void main(String[] args) {
        Triple<Integer, String, Double> triple1 = new Triple<>(1, "One", 1.1);
        Triple<String, String, Integer> triple2 = new Triple<>("Hello", "World", 100);
        Triple<Double, Boolean, Character> triple3 = new Triple<>(3.14, true, 'A');

        System.out.println(triple1);
        System.out.println(triple2);
        System.out.println(triple3);
    }
}
