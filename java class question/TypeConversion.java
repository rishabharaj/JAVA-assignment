public class TypeConversion {
   static char a = 'A';
   static char d = '0';
    static int i = (int) a; // ye type cast char ko ASCII value me convert krta hai
    static int j = (int)d;
    public static void main(String[] args){
        System.out.println(i);
        System.out.println(j);
    }
}
