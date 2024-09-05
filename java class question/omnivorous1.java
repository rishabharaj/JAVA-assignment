 import java.util.*;
 class Animal{
    String name ;
    int age = 10;
   void eat(){
    System.out.println("Animal can eat");
   }
    Animal(){
        System.out.println("Animal constructor running");
    }
}
 class dog extends Animal{
    void setname(String a){
        this.name = a;
    } 
    void name(){
        super.eat();
        System.out.println(super.name+" "+age);
    }
 }
public class omnivorous {
    public static void main(String[] args) {
        String name1;
        System.out.println("Name the animal:");
        dog d1 = new dog();
        Scanner sc = new Scanner(System.in);
        name1= sc.nextLine();
        d1.setname(name1);
        d1.name();        
    }
}
