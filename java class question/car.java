class car{  
    final int speed=10;
    car(){
       // speed++; // we can not change the variable of final it will give compile time error
        System.out.println(speed);
    }
    void start(){  
   // speed=20; 
    System.out.println(speed); 
    }  
    public static void main(String args[]){  
    car obj=new  car();  
    obj.start();  
    }  
   } 