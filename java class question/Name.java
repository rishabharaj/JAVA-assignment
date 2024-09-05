import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(name);
        int value = name.length();
        String nonTrimmedString = "     Rishabharaj    ";
        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(nonTrimmedString.trim()); // trim the spaces in the string
        System.out.println(name.substring(4)); // index start
        System.out.println(name.substring(4,6)); // start and end but end is excluded.
        System.out.println(name.replace('j','t')); // replaces the char j with t
        System.out.println(name.replace("raj","aaj"));
        
    }
}