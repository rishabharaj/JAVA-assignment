// Question 26: Write a Java program to create a generic class Sextuple that holds six objects of any type.
// Demonstrate the use of this generic class by creating sextuples of different types and printing their values.

class Sextuple<T, U, V, W, X, Y> {
    private T first;
    private U second;
    private V third;
    private W fourth;
    private X fifth;
    private Y sixth;

    public Sextuple(T first, U second, V third, W fourth, X fifth, Y sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
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

    public X getFifth() {
        return fifth;
    }

    public Y getSixth() {
        return sixth;
    }

    @Override
    public String toString() {
        return "Sextuple{" + "first=" + first + ", second=" + second + ", third=" + third + ", fourth=" + fourth + ", fifth=" + fifth + ", sixth=" + sixth + '}';
    }
}

class SextupleDemo {
    public static void main(String[] args) {
        Sextuple<Integer, String, Double, Boolean, Character, Long> sextuple1 = new Sextuple<>(1, "One", 1.1, true, 'A', 123456L);
        Sextuple<String, String, Integer, Character, Float, Double> sextuple2 = new Sextuple<>("Hello", "World", 100, 'B', 2.5f, 3.14159);
        Sextuple<Double, Boolean, Character, String, Long, Integer> sextuple3 = new Sextuple<>(3.14, false, 'C', "Example", 987654321L, 42);

        System.out.println(sextuple1);
        System.out.println(sextuple2);
        System.out.println(sextuple3);
    }
}
