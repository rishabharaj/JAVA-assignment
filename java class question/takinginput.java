import java.net.SocketPermission;
import java.util.Scanner;

public class takinginput{
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
}