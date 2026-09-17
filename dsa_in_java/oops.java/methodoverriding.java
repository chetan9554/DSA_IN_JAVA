import java.util.*;
class animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("eat grass");
    }
}
public class methodoverriding{
    public static void main(String args[]){
        deer d=new deer();
        d.eat();
        animal d=new animal();
        d.eat();
    }
}