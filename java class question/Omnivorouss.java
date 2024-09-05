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
class babydog extends dog{
    void drink(){
        System.out.println(super.age +" baby dog drink milk");
    }
}
public class Omnivorouss {
   public static void main(String[] args) {
       String name1;
       System.out.println("Name the animal:");
       babydog d2 = new babydog();
       Scanner sc = new Scanner(System.in);
       name1= sc.nextLine();
       d2.setname(name1);
       d2.name();      
       d2.drink();  
       
   }
}