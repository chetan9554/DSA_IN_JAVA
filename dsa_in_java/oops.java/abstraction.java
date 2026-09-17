import java.util.*;
abstract class animal{
    void eat(){
        System.out.println("they can eat");
    }
    abstract void walk();
}
class horse extends animal{
    void walk(){
        System.out.println("horse walk on 4 legs");
    }
}
class chiken extends animal{
    void walk(){
        System.out.println("chikens walk on 2 legs");
    }
}
public class abstraction {
    public static void main(String args[]){
        horse h=new horse();
        chiken c=new chiken();
        h.walk();
        h.eat();
        c.eat();
        c.walk();
    }
}
