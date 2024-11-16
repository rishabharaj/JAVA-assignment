// Question 11: Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number.
// Now create a derived class HexNum which inherits Num and overrides shownum() which displays the hexadecimal value and octal value of the number.
// Demonstrate the working of the classes.

class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    void shownum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

class NumTest {
    public static void main(String[] args) {
        Num num = new Num(255);
        num.shownum();

        HexNum hexNum = new HexNum(255);
        hexNum.shownum();
    }
}
