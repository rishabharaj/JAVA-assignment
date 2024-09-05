import java.net.SocketPermission;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputnumber;
    public int attempts=0;

    Game(){
        Random random = new Random();
        this.number = random.nextInt(50);
    }
    void inputnumber(){
        attempts++;
        System.out.println("Guess the number : ");
        Scanner num = new Scanner(System.in);
        this.inputnumber = num.nextInt();
    }

     boolean b(){
        if(inputnumber==number){
            System.out.format("Yes!!!! you are right the number is %d and you too %d attempt",number,attempts);
            return true;
        }
        else if(inputnumber>number){
            System.out.println("You guess the high number..");
        }
        else if(inputnumber<number){
            System.out.println("You guess the low number..");
        }

       return false; 
    }
}
public class Play {
    public static void main(String[] args) {
       Game g1 = new Game();
       boolean b= true;
        while(b){
       g1.inputnumber();
       g1.b(); }
    }   
}
