import java.util.*;
     
    class animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
    class fish extends animal{
        int fins;
        void swim(){
            System.out.println("swim in water");
        }
    
}
public class inheritance{
public static void main(String args[]){
       fish f1=new fish();
       f1.eat();
       f1.breathe();
    }
}
   