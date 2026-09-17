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
class mammal extends animal{
    int legs;
    void walk(){
        System.out.println("they can walk");
    }
}
class dog extends animal{
    String breed;
}
public class multilevel{
public static void main(String args[]){
    dog s1=new dog();
    s1.eat();
    s1.breathe();
    // s1.walk();
}

}