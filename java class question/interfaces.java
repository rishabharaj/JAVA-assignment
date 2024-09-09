interface bicycle{
    void speedUp(int increment);
    void applyBrake(int decrement);
}

interface cycle{
    void blowHorn();
}

class AvonCycle implements bicycle,cycle{
     public void speedUp(){
        System.out.println("ssssuuuiiiiii");
    }
    public void applyBrake(){
        System.out.println("Applying brake");
    }
    public void blowHorn(){
        System.out.println("peeeeeepppppp");
    }
}



public class interfaces {
 public static void main(String[] args) {
    AvonCycle av = new AvonCycle();
    av.applyBrake();
 }
    
}
