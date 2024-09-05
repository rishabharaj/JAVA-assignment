public class Q9_FactorialOf12 {
    public static void main(String[] args) {
        int number = 12;
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of 12 is: " + factorial);
    }
}
