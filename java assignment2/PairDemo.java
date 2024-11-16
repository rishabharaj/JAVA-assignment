// Question 22: Write a Java program to create a generic class Pair that holds two objects of any type.
// Demonstrate the use of this generic class by creating pairs of different types and printing their values.

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }
}

class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<String, String> pair2 = new Pair<>("Hello", "World");
        Pair<Double, Boolean> pair3 = new Pair<>(3.14, true);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }
}
