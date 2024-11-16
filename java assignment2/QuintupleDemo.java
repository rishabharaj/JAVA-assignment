// Question 25: Write a Java program to create a generic class Quintuple that holds five objects of any type.
// Demonstrate the use of this generic class by creating quintuples of different types and printing their values.

class Quintuple<T, U, V, W, X> {
    private T first;
    private U second;
    private V third;
    private W fourth;
    private X fifth;

    public Quintuple(T first, U second, V third, W fourth, X fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
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

    @Override
    public String toString() {
        return "Quintuple{" + "first=" + first + ", second=" + second + ", third=" + third + ", fourth=" + fourth + ", fifth=" + fifth + '}';
    }
}

class QuintupleDemo {
    public static void main(String[] args) {
        Quintuple<Integer, String, Double, Boolean, Character> quintuple1 = new Quintuple<>(1, "One", 1.1, true, 'A');
        Quintuple<String, String, Integer, Character, Float> quintuple2 = new Quintuple<>("Hello", "World", 100, 'B', 2.5f);
        Quintuple<Double, Boolean, Character, String, Long> quintuple3 = new Quintuple<>(3.14, false, 'C', "Example", 123456789L);

        System.out.println(quintuple1);
        System.out.println(quintuple2);
        System.out.println(quintuple3);
    }
}
